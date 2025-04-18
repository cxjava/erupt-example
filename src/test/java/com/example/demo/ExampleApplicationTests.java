package com.example.demo;

import com.example.demo.model.Article;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.erupt.jpa.dao.EruptDao;

import java.util.List;
import xyz.erupt.upms.model.EruptRole;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ExampleApplicationTests {


    @Resource
    private EruptDao eruptDao;

    //查询
    @Test
    public void query() {
        List<EruptRole> articles = eruptDao.lambdaQuery(EruptRole.class)
                .eq(EruptRole::getStatus, false).list();
        System.out.println(articles);
    }

}
