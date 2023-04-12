package com.shf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Su HangFei
 * @Date:2023-04-12 14 31
 * @Project:LiGongSSM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class tbworker {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private Integer workerId;

    public tbworker(Integer id, Integer age) {
        this.id = id;
        this.age = age;
    }

    public tbworker(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public tbworker(String name, Integer age, String sex, Integer workerId) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.workerId = workerId;
    }
}
