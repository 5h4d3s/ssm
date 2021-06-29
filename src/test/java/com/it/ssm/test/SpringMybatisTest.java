package com.it.ssm.test;

import com.it.ssm.pojo.Item;
import com.it.ssm.service.itemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})

public class SpringMybatisTest {
    @Autowired
    private itemService itemService;
    @Test
    public  void test1(){
        Item item = itemService.findById(1);
        System.out.println(item);

    }

}
