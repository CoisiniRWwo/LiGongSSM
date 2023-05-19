package com.shf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Su HangFei
 * @Date:2023-05-19 10 28
 * @Project:LiGongSSM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String username;
    private String password;
    private String course;
}
