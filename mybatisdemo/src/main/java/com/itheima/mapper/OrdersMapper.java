package com.itheima.mapper;

import com.itheima.pojo.Orders;

import java.util.List;

public interface OrdersMapper {
    List<Orders> selectByid(int id);
}
