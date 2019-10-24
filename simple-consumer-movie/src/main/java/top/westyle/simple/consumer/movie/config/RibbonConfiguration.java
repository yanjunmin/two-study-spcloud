package top.westyle.simple.consumer.movie.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用java代码配置ribbon负载均衡
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        //负载均衡改为随机分配
        return new RandomRule();
    }
}
