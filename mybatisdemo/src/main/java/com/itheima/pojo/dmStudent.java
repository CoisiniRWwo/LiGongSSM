package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Su HangFei
 * @Date:2023-03-16 10 12
 * @Project:LiGongSSM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class dmStudent {
    private Integer id;
    private String name;
    private String major;
    private Integer sno;

    public dmStudent(String name, String major, Integer sno) {
        this.name = name;
        this.major = major;
        this.sno = sno;
    }

    public dmStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }
}
