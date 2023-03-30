package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 18 40
 * @Project:LiGongSSM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewProduct {
    private Integer id;
    private String goodsname;
    private Integer price;
}
