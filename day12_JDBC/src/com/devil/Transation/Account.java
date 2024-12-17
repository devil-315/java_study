package com.devil.Transation;

import com.devil.util.JDBCUtil_ptimize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName：Account
 *
 * @author: Devil
 * @Date: 2024/8/28
 * @Description:
 * @version: 1.0
 */
public class Account {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtil_ptimize.getconnection();

            //关闭自动提交 开启事务
            connection.setAutoCommit(false);

            // A --》 B转500元
            String sqlA = "UPDATE account set cash = cash -500 where name = 'A';";
            preparedStatement = connection.prepareStatement(sqlA);
            preparedStatement.executeUpdate();


            //默认失败  一定会异常
            int a = 1/0;


            String sqlB = "UPDATE account set cash = cash + 500 where name = 'B';";
            preparedStatement = connection.prepareStatement(sqlB);
            preparedStatement.executeUpdate();

            //手动提交
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil_ptimize.relese(connection,preparedStatement,null);
        }
    }
}
