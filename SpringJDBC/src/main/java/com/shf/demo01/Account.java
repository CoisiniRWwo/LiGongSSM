package com.shf.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Su HangFei
 * @Date:2023-05-18 10 40
 * @Project:LiGongSSM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Integer id;
    private String username;
    private Double balance;
}
