package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Gatsjy
 * @since 2021-01-31
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class ItemRepositoryTest extends StudyApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create(){
        
        Item item = new Item();
        item.setName("노트북");
        item.setPrice(1000000);
        item.setContent("삼성 노트북");

        Item newItem = itemRepository.save(item);

        Assert.assertNotNull(newItem);
    }
}
