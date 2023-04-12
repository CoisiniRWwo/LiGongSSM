package com.shf.mapper;

import com.shf.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-04-12 15 52
 * @Project:LiGongSSM
 */
public interface ProductMapper {
    @Select("select * from tb_product where id in (select product_id from tb_ordersitem where orders_id=#{orderId})")
    List<Product> selectProductsByOrdersId(int orderId);
}
