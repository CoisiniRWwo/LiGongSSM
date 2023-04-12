package com.shf.mapper;

import com.shf.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentMapper {
    @Update("update s_student set name = #{name},age = #{age} where id =#{id}")
    int updateStudent(Student student);

    @Select("select * from s_student where cid = #{cid}")
    Student selectById(int cid);
}
