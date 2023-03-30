import com.itheima.mapper.*;
import com.itheima.pojo.*;
import com.itheima.utils.MyBatisUtils;
import com.itheima.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
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
        List<dmStudent> dmStudentMappers = mapper.demoIf("数学");
        System.out.println(dmStudentMappers);
    }

    @Test
    public void demoWhere() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.demoWhere(new dmStudent("王五","计算机",	10003));
        System.out.println(dmStudentMappers);
    }

    @Test
    public void demoTrim() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.demoTrim(new dmStudent("李四","英语",10002));
        System.out.println(dmStudentMappers);
    }

    @Test
    public void demoChoose() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.demoChoose(new dmStudent("李四","英语",10002));
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
        List<dmStudent> dmStudentMappers = mapper.getByNameNotNull("王五");
        System.out.println(dmStudentMappers);
    }

    @Test
    public void getByMajorNotNull() throws IOException{
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        dmStudentMapper mapper = myBatisUtils.sqlSession().getMapper(dmStudentMapper.class);
        List<dmStudent> dmStudentMappers = mapper.getByMajorNotNull(new dmStudent(null,"数学"));
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
        int dmStudentMappers = mapper.demoUpdate(new dmStudent(7,"关羽","俄语",10007));
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
        hashMap.put("major","计算机");
        List<dmStudent> dmStudentMappers = mapper.getByForEachMap(hashMap);
        System.out.println(dmStudentMappers);

    }

    @Test
    public void findPersonByIdTest() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        PersonMapper personMapper = myBatisUtils.sqlSession().getMapper(PersonMapper.class);
        Person personById = personMapper.findPersonById(1);
        System.out.println(personById);
        Person personById2 = personMapper.findPersonById2(2);
        System.out.println(personById2);
    }

    @Test
    public void findUserTest() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        UsersMapper usersMapper = myBatisUtils.sqlSession().getMapper(UsersMapper.class);
        Users userWithOrders = usersMapper.findUserWithOrders(1);
        System.out.println(userWithOrders);
        Users userWithOrders2 = usersMapper.findUserWithOrders2(1);
        System.out.println(userWithOrders2);
    }

    @Test
    public void findOrdersTest() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        OrderItemMapper orderItemMapper = myBatisUtils.sqlSession().getMapper(OrderItemMapper.class);
        OrderItem ordersWithProduct = orderItemMapper.findOrdersWithProduct(1);
        System.out.println(ordersWithProduct);
        OrderItem ordersWithProduct2 = orderItemMapper.findOrdersWithProduct2(1);
        System.out.println(ordersWithProduct2);
    }

    @Test
    public void findCategoryTest() throws IOException {
        MyBatisUtils myBatisUtils = new MyBatisUtils();
        CategoryMapper categoryMapper = myBatisUtils.sqlSession().getMapper(CategoryMapper.class);
        Category categoryTest = categoryMapper.findCategoryTest(2);
        System.out.println(categoryTest);
    }

    @Test
    public void findBookByIdTest1() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        Book book1 = sqlSession.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        System.out.println(book1);
        Book book2 = sqlSession.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        System.out.println(book2);
        sqlSession.close();
    }

    @Test
    public void findBookByIdTest2() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        Book book1 = sqlSession.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        System.out.println(book1);
        Book book2 = new Book();
        book2.setId(3);
        book2.setBookName("MySQL数据库入门");
        book2.setPrice(40.0);
        sqlSession.update("com.itheima.mapper.BookMapper.updateBook", book2);
        Book book3 = sqlSession.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        System.out.println(book1);
        sqlSession.close();
    }

    @Test
    public void findBookByIdTest3() {
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        Book book1 = sqlSession1.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        System.out.println(book1);
        sqlSession1.close();
        Book book2 = sqlSession2.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        System.out.println(book2);
        sqlSession2.close();
    }

    @Test
    public void findBookByIdTest4() {
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        SqlSession sqlSession3 = SqlSessionUtil.getSqlSession();
        Book book1 = sqlSession1.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        System.out.println(book1);
        sqlSession1.close();
        Book book2 = new Book();
        book2.setId(2);
        book2.setBookName("Java Web程序开发进阶");
        book2.setPrice(45.0);
        sqlSession2.update("com.itheima.mapper.BookMapper.updateBook", book2);
        sqlSession2.commit();
        sqlSession2.close();
        Book book3 = sqlSession3.selectOne("com.itheima.mapper.BookMapper.findBookById", 1);
        System.out.println(book3);
        sqlSession3.close();
    }
}
