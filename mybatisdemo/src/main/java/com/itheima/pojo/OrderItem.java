package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 11 22
 * @Project:LiGongSSM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private Integer id;
    private Integer orders_id;
    private Integer product_id;
    private List<Product> productList;
}
