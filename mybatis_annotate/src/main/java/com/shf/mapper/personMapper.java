package com.shf.mapper;

import com.shf.pojo.Person;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @Author:Su HangFei
 * @Date:2023-04-12 15 03
 * @Project:LiGongSSM
 */
public interface personMapper {

    @Select("select * from tb_person where id = #{id}")
    @Results(@Result(
            column = "id",
            property = "card",
            one = @One(select = "com.shf.mapper.IdCardMapper.selectById")
            ))
    Person selectandCard(int id);
}
