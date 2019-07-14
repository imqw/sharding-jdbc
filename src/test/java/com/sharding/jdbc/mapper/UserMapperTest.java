package com.sharding.jdbc.mapper;

import com.sharding.jdbc.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {


    @Autowired
    UserMapper userMapper;


    @Test
    public void testSave() {

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("test" + i);
            user.setCityId(1 % 2 == 0 ? 1 : 2);
            user.setCreateTime(new Date());
            user.setSex(i % 2 == 0 ? 1 : 2);
            user.setPhone("11111111" + i);
            user.setEmail("xxxxx");
            user.setCreateTime(new Date());
            user.setPassword("eeeeeeeeeeee");
            user.setTaskId(2L);
            userMapper.save(user);
        }

    }


    @Test
    public void testGet() {

        User user = userMapper.get(356122892976521216L, 0L);

        System.out.println(user.toString());

    }


    @Test
    public void testPaging() {
        Map<String, Object> map = new HashMap<>();
        map.put("task_id", 1L);
        map.put("start", 0);
        map.put("end", 10);

        List<User> users = this.userMapper.pagingUser(map);


        System.out.println(users.toString());


    }

}