package top.westyle.simpuser.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.westyle.simpuser.entity.common.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
