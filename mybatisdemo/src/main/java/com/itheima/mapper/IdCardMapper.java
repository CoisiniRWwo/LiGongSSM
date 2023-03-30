package com.itheima.mapper;

import com.itheima.pojo.IdCard;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 10 20
 * @Project:LiGongSSM
 */
public interface IdCardMapper {
    IdCard findCodeByID(int id);
}
