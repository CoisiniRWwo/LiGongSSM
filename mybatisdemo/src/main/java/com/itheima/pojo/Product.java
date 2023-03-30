package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 11 20
 * @Project:LiGongSSM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Double price;
}
