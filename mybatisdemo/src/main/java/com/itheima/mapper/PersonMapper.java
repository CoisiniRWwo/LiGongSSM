package com.itheima.mapper;

import com.itheima.pojo.Person;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 10 22
 * @Project:LiGongSSM
 */
public interface PersonMapper {
    Person findPersonById(int id);

    Person findPersonById2(int id);
}
