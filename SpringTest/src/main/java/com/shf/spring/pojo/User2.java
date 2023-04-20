package com.shf.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Su HangFei
 * @Date:2023-04-20 10 30
 * @Project:LiGongSSM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User2 {
    private Integer id;
    private String username;
    private String password;
    private User user;
}
