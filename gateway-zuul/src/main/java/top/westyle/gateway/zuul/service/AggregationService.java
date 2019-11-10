package top.westyle.gateway.zuul.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rx.Observable;
import top.westyle.gateway.zuul.entity.User;


@Service
public class AggregationService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public Observable<User> getMovieUserByUserId(Long id){
        //创建一个被观察者
        return Observable.create(observable -> {
            //请求电影微服务
            User movieUser = restTemplate.getForObject("http://consumer-movie/user/{id}", User.class, id);
            observable.onNext(movieUser);
            observable.onCompleted();
        });
    }
    @HystrixCommand(fallbackMethod = "fallback")
    public  Observable<User> getUserById(Long id) {
        //创建被观察者
        return Observable.create(observable -> {
            //请求用户微服务
            User user = restTemplate.getForObject("http://provider-user/{id}", User.class, id);
            observable.onNext(user);
            observable.onCompleted();
        });
    }

    public User fallback(Long id) {
        User user = new User();
        user.setId(-1L);
        return user;
    }
}
