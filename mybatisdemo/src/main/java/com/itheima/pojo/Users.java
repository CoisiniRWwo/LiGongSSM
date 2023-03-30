package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-03-30 10 40
 * @Project:LiGongSSM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private Integer id;
    private  String username;
    private  String address;
    private List<Orders> ordersList;

}
