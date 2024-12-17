package com.devil.statement;

import com.devil.util.JDBCUtil;
import com.devil.util.JDBCUtil_ptimize;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ClassName：SelectTest
 *
 * @author: Devil
 * @Date: 2024/8/28
 * @Description:
 * @version: 1.0
 */
public class SelectTest {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //1.获取数据库连接
            connection = JDBCUtil_ptimize.getconnection();

            //2.创建执行sql的对象
            statement = connection.createStatement();

            //3.执行Sql,可能存在的结果
            String sql = "select * from user";

            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
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
