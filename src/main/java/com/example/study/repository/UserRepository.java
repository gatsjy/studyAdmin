package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Gatsjy
 * @since 2021-01-27
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByPhoneNumberOrderById(String phoneNumber);
}
