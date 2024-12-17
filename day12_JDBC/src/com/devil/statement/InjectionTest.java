package com.devil.statement;

import com.devil.util.JDBCUtil_ptimize;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ClassName：InjectionTest
 *
 * @author: Devil
 * @Date: 2024/8/28
 * @Description:
 * @version: 1.0
 */
public class InjectionTest {
    public static void main(String[] args) {
        InjectionTest injectionTest = new InjectionTest();
        //正常情况
//        injectionTest.login("张三","123");

        //sql注入
        // 'or 1=1#
        injectionTest.login("'or 1=1#","123");
    }
    public void login(String useName,String password){
        Connection connection =null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil_ptimize.getconnection();
            statement = connection.createStatement();

            String sql = "select * from user where name = '" + useName + "' and password = '" + password + "'";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("登陆成功");
                System.out.println("id:" + resultSet.getInt("id"));
                System.out.println("password:" + resultSet.getString("password"));
                System.out.println("name:" + resultSet.getString("name"));
                System.out.println("email:" + resultSet.getString("email"));
                System.out.println("birthday:" + resultSet.getString("birthday"));
                System.out.println("==========");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil_ptimize.relese(connection,statement,resultSet);
        }
    }
}
