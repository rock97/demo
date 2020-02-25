package com.roncoo.example;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.test.context.junit4.SpringRunner;

import com.roncoo.example.bean.RoncooUserLog;
import com.roncoo.example.dao.RoncooUserLogDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo141ApplicationTests {
    @Autowired
    private RoncooUserLogDao roncooUserLogDao;

    @Test
    public void insert() {
        RoncooUserLog entity = new RoncooUserLog();
        entity.setUserName("无境");
        entity.setUserIp("192.168.0.1");
        entity.setCreateTime(new Date());
        roncooUserLogDao.save(entity);
    }

    @Test
    public void delete() {
        roncooUserLogDao.delete(1);
    }

    @Test
    public void update() {
        RoncooUserLog entity = new RoncooUserLog();
        entity.setId(2);
        entity.setUserName("无境2");
        entity.setUserIp("192.168.0.1");
        entity.setCreateTime(new Date());
        roncooUserLogDao.save(entity);
    }

    @Test
    public void select() {
        RoncooUserLog result = roncooUserLogDao.findOne(2);
        System.out.println(result);
    }

    @Test
    public void select2() {
        RoncooUserLog result = roncooUserLogDao.findByUserName("无境2");
        System.out.println(result);
    }

    // 分页
    @Test
    public void queryForPage() {
        Pageable pageable = new PageRequest(0, 20, new Sort(new Order(Direction.DESC, "id")));
        //Page<RoncooUserLog> result = roncooUserLogDao.findByUserName("无境2", pageable);
        Page<RoncooUserLog> result = roncooUserLogDao.findAll(pageable);
        System.out.println(result.getContent());
    }


}
