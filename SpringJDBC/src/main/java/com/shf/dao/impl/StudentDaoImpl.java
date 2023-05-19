package com.shf.dao.impl;

import com.shf.dao.StudentDao;
import com.shf.entity.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author:Su HangFei
 * @Date:2023-05-19 10 31
 * @Project:LiGongSSM
 */
public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student findStudentByUsername(String username, String password) {
        String sql = "select * from student where username = ? and password = ?";
        Student student = null;
        try {
            student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), username, password);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
        return student;
    }
}
