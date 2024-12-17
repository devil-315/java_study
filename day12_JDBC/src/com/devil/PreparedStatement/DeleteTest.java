package com.devil.PreparedStatement;

import com.devil.util.JDBCUtil_ptimize;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName：DeleteTest
 *
 * @author: Devil
 * @Date: 2024/8/28
 * @Description:
 * @version: 1.0
 */
public class DeleteTest {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        try {
            connection = JDBCUtil_ptimize.getconnection();
            String sql = "delete from user where name = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"devil");
            int i = preparedStatement.executeUpdate();
            if(i>0){
                System.out.println("删除成功");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtil_ptimize.relese(connection,preparedStatement,null);
        }
    }
}
