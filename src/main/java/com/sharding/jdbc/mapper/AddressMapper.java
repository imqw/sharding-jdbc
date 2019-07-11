package com.sharding.jdbc.mapper;

import com.sharding.jdbc.bean.Address;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
@Mapper
public interface AddressMapper {

    void save(Address address);


    Address get(Long id);

}
