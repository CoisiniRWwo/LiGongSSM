package com.shf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 10 39
 * @Project:LiGongSSM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private Integer id;
    private String number;
    private Integer userId;
    private List<Product> productList;
}
