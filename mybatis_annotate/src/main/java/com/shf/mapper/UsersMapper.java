package com.shf.mapper;

import com.shf.pojo.Users;
import org.apache.ibatis.annotations.*;

public interface UsersMapper {

    @Select("select * from tb_user where id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "address", column = "address"),
            @Result(property = "ordersList",
                    column = "id",
                    many = @Many(select = "com.shf.mapper.OrdersMapper.selectByUserId"))
    })
    Users selectUserById(int id);
}
