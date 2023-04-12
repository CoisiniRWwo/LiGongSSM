package com.shf.mapper;

import com.shf.pojo.Orders;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {

    @Select("select * from tb_orders where user_id = #{uid}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "number", column = "number")
    })
    List<Orders> selectByUserId(int uid);

    @Select("select * from tb_orders where id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "number", column = "number"),
            @Result(property = "productList",
                column = "id",
                many = @Many(select = "com.shf.mapper.ProductMapper.selectProductsByOrdersId"))
    })
    Orders selectOrderById(int id);
}
