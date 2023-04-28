package com.shf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author:Su HangFei
 * @Date:2023-04-27 11 21
 * @Project:LiGongSSM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("user")
@Scope("singleton")
public class User {
    @Value("1")
    private int id;
    @Value("张三")
    private String username;
    @Value("123")
    private String password;
}
