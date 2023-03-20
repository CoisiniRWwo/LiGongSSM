import com.itheima.mapper.EmployeeMapper;
import com.itheima.mapper.dmStudentMapper;
import com.itheima.pojo.Employee;
import com.itheima.pojo.dmStudent;
import com.itheima.utils.MyBatisUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @Author:Su HangFei
 * @Date:2023-02-23 10 28
 * @Project:LiGongSSM
 */
public class MyBatisTest {
    @Test
    public void getById() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        //通过代理模式创建UserMapper接口的代理实现类对象
        EmployeeMapper employeeMapper = myBatisUtils.sqlSession().getMapper(EmployeeMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        Employee result = employeeMapper.getById(1);
        System.out.println("结果：" + result);
    }

    @Test
    public void insert() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        //通过代理模式创建UserMapper接口的代理实现类对象
        EmployeeMapper employeeMapper = myBatisUtils.sqlSession().getMapper(EmployeeMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result = employeeMapper.insert(new Employee(null,"赵六",20,"老板"));
        if (result ==1){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
    }

    @Test
    public void updateById() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        //通过代理模式创建UserMapper接口的代理实现类对象
        EmployeeMapper employeeMapper = myBatisUtils.sqlSession().getMapper(EmployeeMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result = employeeMapper.updateById(new Employee(11,"小红",36,null));
        if (result ==1){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void deleteById() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        //通过代理模式创建UserMapper接口的代理实现类对象
        EmployeeMapper employeeMapper = myBatisUtils.sqlSession().getMapper(EmployeeMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
        int result = employeeMapper.deleteById(11);
        if (result ==1){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    @Test
    public void demoIf() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.demoIf(2);
        System.out.println(dmStudentMappers);
    }

    @Test
    public void demoWhere() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.demoWhere(new dmStudent(5,"小黑","c",1));
        System.out.println(dmStudentMappers);
    }

    @Test
    public void demoTrim() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.demoTrim(new dmStudent(4,"小新","a",2));
        System.out.println(dmStudentMappers);
    }

    @Test
    public void demoChoose() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.demoChoose(new dmStudent(4,"小新","a",2));
        System.out.println(dmStudentMappers);
    }

    @Test
    public void demoForeach() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        ArrayList<dmStudent> dmStudents = new ArrayList<>();
        dmStudents.add(new dmStudent("小小","a",3));
        dmStudents.add(new dmStudent("大大","b",1));
        int dmStudentMappers = mapper.demoForeach(dmStudents);
        if (dmStudentMappers>=1){
            System.out.println("成功添加"+dmStudentMappers+"条数据");
        }
    }

    @Test
    public void getByNameNotNull() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.getByNameNotNull("小明");
        System.out.println(dmStudentMappers);
    }

    @Test
    public void getByMajorNotNull() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.getByMajorNotNull(new dmStudent(null,"a"));
        System.out.println(dmStudentMappers);
    }

    @Test
    public void getByMajorNull() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.getByMajorNull(new dmStudent(null,null));
        System.out.println(dmStudentMappers);
    }

    @Test
    public void getByIdmin() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.getByIdmin(5);
        System.out.println(dmStudentMappers);
    }

    @Test
    public void demoUpdate() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        int dmStudentMappers = mapper.demoUpdate(new dmStudent(10,"中中","a",2));
        if (dmStudentMappers>=1){
            System.out.println("修改数据成功");
        }
    }

    @Test
    public void getByForEachArray() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        int[] ints = {2, 3};
        List<dmStudent> dmStudentMappers = mapper.getByForEachArray(ints);
        System.out.println(dmStudentMappers);
    }

    @Test
    public void getByForEachList() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        List<dmStudent> dmStudentMappers = mapper.getByForEachList(integers);
        System.out.println(dmStudentMappers);
    }

    @Test
    public void getByForEachMap() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id",integers);
        hashMap.put("major","c");
        List<dmStudent> dmStudentMappers = mapper.getByForEachMap(hashMap);
        System.out.println(dmStudentMappers);
    }
}