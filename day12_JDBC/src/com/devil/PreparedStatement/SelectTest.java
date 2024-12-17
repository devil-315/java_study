package com.devil.PreparedStatement;

import com.devil.util.JDBCUtil_ptimize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil_ptimize.getconnection();
            String sql = "select * from user where name = ? and password = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,"'or 1=1#");
            preparedStatement.setString(2,"123");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("id:" + resultSet.getInt("id"));
                System.out.println("name:"+resultSet.getString("name"));
                System.out.println("password:"+resultSet.getString("password"));
                System.out.println("email:"+resultSet.getString("email"));
                System.out.println("birthday:"+resultSet.getString("birthday"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil_ptimize.relese(connection,preparedStatement,resultSet);
        }
    }
}
