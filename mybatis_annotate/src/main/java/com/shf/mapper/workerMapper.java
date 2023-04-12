package com.shf.mapper;

import com.shf.pojo.tbworker;
import org.apache.ibatis.annotations.*;

public interface workerMapper {
    @Select("select * from tb_worker where id = #{id}")
    tbworker findWorkerAll(int id);

    @Insert("insert into tb_worker (name,age,sex,worker_id) values (#{name},#{age},#{sex},#{workerId})")
    int insertWorker(tbworker tbworker);

    @Update("update tb_worker set age = #{age} where id = #{id}")
    int updateWorker(tbworker tbworker);

    @Delete("delete from tb_worker where id = #{id}")
    int deleteWorker(int id);

    @Select("select * from tb_worker where id = #{param1} and name = #{param2}")
    tbworker findWorkerAById(@Param("param1") int id, @Param("param2") String name);
}
