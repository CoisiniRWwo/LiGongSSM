package com.itheima.mapper;

import com.itheima.pojo.Product;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 11 31
 * @Project:LiGongSSM
 */
public interface ProductMapper {
    List<Product> findProductById(int id);
}
