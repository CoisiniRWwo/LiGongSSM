package com.itheima.mapper;

import com.itheima.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    Employee getById(int id);

    int insert(Employee employee);

    int deleteById(int id);

    int updateById(Employee employee);
}
