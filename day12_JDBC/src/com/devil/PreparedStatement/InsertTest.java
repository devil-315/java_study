package com.devil.PreparedStatement;

import com.devil.util.JDBCUtil_ptimize;

import java.sql.*;


/**
 * ClassName：InsertTest
 *
 * @author: Devil
 * @Date: 2024/8/28
 * @Description:
 * @version: 1.0
 */
public class InsertTest {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //1.连接数据库
            connection = JDBCUtil_ptimize.getconnection();

            //2.定义sql
            String sql = "insert into user(name,password,email,birthday) values(?,?,?,?)";

            //预编译sql
            preparedStatement = connection.prepareStatement(sql);

            //手动赋值
            preparedStatement.setString(1,"devil");
            preparedStatement.setString(2,"123");
            preparedStatement.setString(3,"123@qq.com");
            preparedStatement.setDate(4, new Date(new java.util.Date().getTime()));
            int i = preparedStatement.executeUpdate();
            if(i > 0){
                System.out.println("成功");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil_ptimize.relese(connection,preparedStatement,null);
        }
    }
}
