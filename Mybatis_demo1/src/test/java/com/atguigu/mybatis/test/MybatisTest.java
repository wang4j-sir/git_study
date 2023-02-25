package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    @Test
    public void test() throws IOException {
        //读取MyBatis的核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
         //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
//        int result = userMapper.insertUser();
//        userMapper.updateUser();
//        userMapper.deleteUser();
//        List<User> userlist = userMapper.findAllUser();
//        System.out.println(user);
//        userlist.foreach((item) -> {
//            System.out.println("User " + item);
//        });
//        userlist.forEach(user -> {
//            System.out.println(user);
//        });
//        User user = userMapper.findUserByName("张三","123");
//        int i = userMapper.addUser(new User(9, "zhangsan", "234", 12, '男', "1586@qq.com"));
//        User user = userMapper.findUser("张三", "123");
//        Map<String, Object> userMap = userMapper.findUserMap("张三", "123");
//        List<Map<String, Object>> userMapList = userMapper.findUserMapList();
//        List<User> userList = userMapper.selectUserLike("张三");
        userMapper.delete("1,2,3");
//        System.out.println(userList.toString());
        sqlSession.commit();

//        System.out.println("结果："+result);
    }

    @Test
    public void testEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        List<Emp> empList = mapper.findEmpList();
//        empList.forEach(emp -> {
//            System.out.println(emp);
//        });
//        List<Emp> empAndDept = mapper.findEmpAndDept(2);
//        Emp empByStepOne = mapper.findEmpByStepOne(1);
//        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
//        Dept deptByDuo = deptMapper.findDeptByDuo(1);
//        List<Emp> emps = deptByDuo.getEmps();
//
//        System.out.println(emps.toString());
//        List<Emp> empByIf = mapper.getEmpByIf(new Emp(null, null, null, null, "",null,1));
//        empByIf.forEach(emp -> {
//            System.out.println(emp);
//        });
//        int i = mapper.deleteEmpBatch(new Integer[]{6, 7, 8});
//        System.out.println(i);

//        Emp emp = new Emp(null, null, null, null, "", null, 1);
//        Emp emp1 = new Emp(null, "liu", null, null, "", null, 1);
//        Emp emp2 = new Emp(null, "sun", null, null, "", null, 1);
//
//        List<Emp> emps = new ArrayList<>();
//        emps.add(emp);
//        emps.add(emp1);
//        emps.add(emp2);
//
//        int i1 = mapper.addEmpBatch(emps);
//        System.out.println(i1);

//        empAndDept.forEach(emp -> {
//            System.out.println(emp);
//        });
//        System.out.println(empByStepOne.toString());
        Emp emp = mapper.findEmp(9);
        System.out.println(emp);
    }

}
