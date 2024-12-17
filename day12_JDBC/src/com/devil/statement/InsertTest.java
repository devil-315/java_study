package com.devil.statement;

import com.devil.util.JDBCUtil_ptimize;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
        Statement statement = null;
        try {
            //1.创建连接
            connection = JDBCUtil_ptimize.getconnection();

            //2.执行Sql的对象
            String sql = "insert into user(id,name,email,birthday) values(4,'devil','123@qq.com','2023-12-12')";

            statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            if(i > 0){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            //TODO 释放连接
            JDBCUtil_ptimize.relese(connection,statement,null);
        }
    }
}
