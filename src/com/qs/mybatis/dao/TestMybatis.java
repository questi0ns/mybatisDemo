package com.qs.mybatis.dao;

import com.qs.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {


//    查询所有用户
    /*public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);
//        通过SqlSessionFactoryBuilder来创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        List<User> list = session.selectList("queryUser");
        for (User user:
             list) {
            System.out.println(user.toString());
        }
        session.commit();
        session.close();s
    }*/

//    根据id查询对应的用户
    /*public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        User user = session.selectOne("findUserById",10);
        System.out.println(user.toString());
        session.commit();
        session.close();
    }*/

//    添加用户
    /*public static void main(String[] args) throws Exception{
        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        User user = new User();
        user.setBirthday("1990-02-21");
        user.setClasses("IIH护理组");
        user.setEmail("tang@666.com");
        user.setJoinSwear("请叫我：尼古拉斯·汤少~");
        user.setName("汤旺盛");
        user.setPhone("12312312312");
        user.setQQ(123123123);

        session.insert("addUser",user);
        session.commit();
        session.close();
    }*/

//    删除用户
    /*public static void main(String[] args) throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        session.delete("deleteUser",12);
        session.commit();
        session.close();
    }*/

//    修改用户
    public static void main(String[] args) throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        User user = session.selectOne("findUserById",10);
        user.setName("麒麟");
        session.update("updateUser",user);

        session.commit();
        session.close();

    }
}
