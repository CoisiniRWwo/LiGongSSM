package com.itheima.mapper;

import com.itheima.pojo.dmStudent;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface dmStudentMapper {
    List<dmStudent> demoIf(String major);
    List<dmStudent> demoWhere(dmStudent student);
    List<dmStudent> demoTrim(dmStudent student);
    List<dmStudent> demoChoose(dmStudent student);
    int demoForeach(@Param("students") List<dmStudent> students);
    List<dmStudent> getByNameNotNull(String name);
    List<dmStudent> getByMajorNotNull(dmStudent student);
    List<dmStudent> getByMajorNull(dmStudent student);
    List<dmStudent> getByIdmin(int id);
    int demoUpdate(dmStudent student);
    List<dmStudent> getByForEachArray(int[] ints);
    List<dmStudent> getByForEachList(ArrayList arrayList);
    List<dmStudent> getByForEachMap(HashMap<String, Object> arrayList);
}
