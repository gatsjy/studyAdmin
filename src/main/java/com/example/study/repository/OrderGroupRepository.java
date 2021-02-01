package com.example.study.repository;

import com.example.study.model.entity.OrderGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Gatsjy
 * @since 2021-02-01
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
@Repository
public interface OrderGroupRepository extends JpaRepository<OrderGroup, Long> {
}
