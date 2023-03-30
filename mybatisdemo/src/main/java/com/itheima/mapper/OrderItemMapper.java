package com.itheima.mapper;

import com.itheima.pojo.OrderItem;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 11 24
 * @Project:LiGongSSM
 */
public interface OrderItemMapper {
    OrderItem findOrdersWithProduct(int id);

    OrderItem findOrdersWithProduct2(int id);
}
