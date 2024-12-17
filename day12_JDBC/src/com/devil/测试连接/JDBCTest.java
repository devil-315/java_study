package com.devil.测试连接;

import java.sql.*;

/**
 * ClassName：JDBCTest
 *
 * @author: Devil
 * @Date: 2024/8/28
 * @Description:
 * @version: 1.0
 */
public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.连接信息
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&&useSSL=false";
        String useName = "root";
        String password = "root";

        //3.连接数据库，通过数据库对象 ,connection就是数据库对象
        Connection connection = DriverManager.getConnection(url, useName, password);

        //4.创建执行sql的对象Statement
        Statement statement = connection.createStatement();

        //5.执行Sql,可能存在的结果
        String sql = "select * from user";

        //executeQuery(sql):查询
        //executeUpdate(sql):增删改
        //execute()：可以指向任何sql
        ResultSet resultSet = statement.executeQuery(sql);

        //resultSet.getObject()
        //获取指定的数据类型
//        resultSet.getString()
//        resultSet.getBoolean()
//        resultSet.getByte()
//        resultSet.getShort()
//        resultSet.getInt()
//        resultSet.getDouble()
        while (resultSet.next()){
            System.out.println("id:" + resultSet.getInt("id"));
            System.out.println("name:" + resultSet.getString("name"));
            System.out.println("email:" + resultSet.getString("email"));
            System.out.println("birthday:" + resultSet.getString("birthday"));
            System.out.println("==========");
        }

        //6.释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
