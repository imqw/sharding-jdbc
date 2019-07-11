package com.sharding.jdbc.mapper;

import com.sharding.jdbc.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: qiuwei@19pay.com.cn
 * @Version 1.0.0
 */
@Mapper
public interface UserMapper {


    void save(User address);


    User get(Long id);

}
