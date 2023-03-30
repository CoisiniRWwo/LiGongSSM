package com.itheima.mapper;

import com.itheima.pojo.Book;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA
 *
 * @Author: Liu
 * @Date: 2023/03/30/17:28
 * @Description:
 */
public interface BookMapper {

    Book findBookById(@Param("id") Integer id);

}
