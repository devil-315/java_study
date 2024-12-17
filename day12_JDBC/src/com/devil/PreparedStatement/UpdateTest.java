package com.devil.PreparedStatement;

import com.devil.util.JDBCUtil_ptimize;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName：UpdateTest
 *
 * @author: Devil
 * @Date: 2024/8/28
 * @Description:
 * @version: 1.0
 */
public class UpdateTest {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtil_ptimize.getconnection();
            String sql = "update user set birthday = ? where name = ?";
            //预编译sql
            preparedStatement = connection.prepareStatement(sql);
            //赋值
            preparedStatement.setDate(1,new Date(System.currentTimeMillis()));
            preparedStatement.setString(2,"devil");
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
