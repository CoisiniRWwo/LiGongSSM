package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 18 41
 * @Project:LiGongSSM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Integer id;
    private String typename;
    private List<NewProduct> newProductList;
}
