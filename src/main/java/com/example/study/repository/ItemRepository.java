package com.example.study.repository;

import com.example.study.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Gatsjy
 * @since 2021-01-31
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
