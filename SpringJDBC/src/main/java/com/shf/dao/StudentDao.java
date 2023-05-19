package com.shf.dao;

import com.shf.entity.Student;

public interface StudentDao {
    Student findStudentByUsername(String username,String password);
}
