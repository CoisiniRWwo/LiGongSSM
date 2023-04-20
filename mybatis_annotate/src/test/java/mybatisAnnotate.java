import com.shf.mapper.*;
import com.shf.pojo.*;
import com.shf.utils.MyBatisUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * @Author:Su HangFei
 * @Date:2023-04-12 14 35
 * @Project:LiGongSSM
 */
public class mybatisAnnotate {
    @Test
    public void findWorkerAll() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        workerMapper categoryMapper = myBatisUtils.sqlSession().getMapper(workerMapper.class);
        tbworker workerAll = categoryMapper.findWorkerAll(1);
        System.out.println(workerAll);
    }

    @Test
    public void insertWorker() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        workerMapper categoryMapper = myBatisUtils.sqlSession().getMapper(workerMapper.class);
        int insertWorker = categoryMapper.insertWorker(new tbworker("赵六", 99, "女", 1004));
        System.out.println("成功插入数据："+insertWorker+"条");
    }

    @Test
    public void updateWorker() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        workerMapper categoryMapper = myBatisUtils.sqlSession().getMapper(workerMapper.class);
        int updateWorker = categoryMapper.updateWorker(new tbworker(5, 1000));
        System.out.println("成功修改数据："+updateWorker+"条");
    }

    @Test
    public void deleteWorker() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        workerMapper categoryMapper = myBatisUtils.sqlSession().getMapper(workerMapper.class);
        int deleteWorker = categoryMapper.deleteWorker(7);
        System.out.println("成功删除数据："+deleteWorker+"条");
    }

    @Test
    public void findWorkerAById() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        workerMapper categoryMapper = myBatisUtils.sqlSession().getMapper(workerMapper.class);
        tbworker workerAById = categoryMapper.findWorkerAById(1, "张三");
        System.out.println(workerAById);
    }

    @Test
    public void selectandCard() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        personMapper personMapper = myBatisUtils.sqlSession().getMapper(personMapper.class);
        Person person = personMapper.selectandCard(1);
//        IdCardMapper mapper = myBatisUtils.sqlSession().getMapper(IdCardMapper.class);
//        IdCard idCard = mapper.selectById(1);
        System.out.println(person);
    }

    @Test
    public void selectUserById() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        UsersMapper usersMapper = myBatisUtils.sqlSession().getMapper(UsersMapper.class);
        Users users = usersMapper.selectUserById(1);
        System.out.println(users);
    }

    @Test
    public void selectOrderById() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        OrdersMapper ordersMapper = myBatisUtils.sqlSession().getMapper(OrdersMapper.class);
        Orders orders = ordersMapper.selectOrderById(1);
        System.out.println(orders);
    }

    @Test
    public void updateStudent() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        StudentMapper mapper = myBatisUtils.sqlSession().getMapper(StudentMapper.class);
        int updateStudent = mapper.updateStudent(new Student(4, "李雷", 21));
        System.out.println("成功修改数据："+updateStudent+"条");
    }

    @Test
    public void selectAllBycid() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        ClassMapper classMapper = myBatisUtils.sqlSession().getMapper(ClassMapper.class);
        cClass selectedAllBycid = classMapper.selectAllBycid(2);
        System.out.println(selectedAllBycid);
    }

}
