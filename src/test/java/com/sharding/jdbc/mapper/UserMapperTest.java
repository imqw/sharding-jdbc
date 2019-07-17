package com.sharding.jdbc.mapper;

import com.sharding.jdbc.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            Long id =i+1L;
            user.setId(id);
            user.setName("test" + i);
            user.setCallMonth("201907");
            user.setTaskId(2L);
            userMapper.save(user);
        }

    }


    @Test
    public void testGet() {

        User user = userMapper.get(2L, 2L);

        System.out.println(user.toString());

    }


    @Test
    public void testPaging() {
        Map<String, Object> map = new HashMap<>();
        map.put("task_id", 2L);
        map.put("start", 0);
        map.put("end", 5);

        List<User> users = this.userMapper.pagingUser(map);


        users.forEach(user->{

            System.out.println(user.toString());

        });





    }

}