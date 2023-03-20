package com.shf.mapper;

import com.shf.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author SHF
 * @description 针对表【users】的数据库操作Mapper
 * @createDate 2023-02-16 10:32:34
 * @Entity generator.domain.Users
 */
@Mapper
public interface UsersMapper {
//    @Select("select * from users where uid = #{id}")
    Users getById(int id);
}




