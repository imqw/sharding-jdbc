package com.sharding.jdbc.mapper;

import com.sharding.jdbc.bean.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressMapperTest {


    @Autowired
    AddressMapper addressMapper;


    @Test
    public void save() {

        for (int i = 0; i < 10; i++) {
            Address address = new Address();

            Long id = i + 1L;

            address.setId(id);
            address.setName("name_" + i);
            address.setAddr("addr_" + i);

            addressMapper.save(address);
        }
    }


    @Test
    public void testGet() {

        Address address = this.addressMapper.get(2L);

        System.out.println(address.toString());


    }


}