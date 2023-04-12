package com.shf.mapper;

import com.shf.pojo.IdCard;
import org.apache.ibatis.annotations.Select;

/**
 * @Author:Su HangFei
 * @Date:2023-04-12 15 02
 * @Project:LiGongSSM
 */
public interface IdCardMapper {
    @Select("select * from tb_idcard where id = #{id}")
    IdCard selectById(int id);
}
