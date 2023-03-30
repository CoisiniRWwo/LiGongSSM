package com.itheima.mapper;

import com.itheima.pojo.Users;

public interface UsersMapper {
    Users findUserWithOrders(int id);

    Users findUserWithOrders2(int id);
}
