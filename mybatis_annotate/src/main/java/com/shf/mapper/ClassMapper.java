package com.shf.mapper;

import com.shf.pojo.cClass;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @Author:Su HangFei
 * @Date:2023-04-12 16 15
 * @Project:LiGongSSM
 */
public interface ClassMapper {
    @Select("select * from c_class where id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "classname", column = "classname"),
            @Result(property = "studentList",
                    column = "id",
                    many = @Many(select = "com.shf.mapper.StudentMapper.selectById"))
    })
    cClass selectAllBycid(int id);
}
