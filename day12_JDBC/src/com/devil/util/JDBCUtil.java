package com.devil.util;

import java.sql.*;

/**
 * ClassName：JDBCUtil
 *
 * @author: Devil
 * @Date: 2024/8/28
 * @Description:
 * @version: 1.0
 */
public class JDBCUtil {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&&useSSL=false";
    private static String useName = "root";
    private static String password = "root";

    static {
        try {
            //加载驱动，一次就够了
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //获取连接
    public static Connection getconnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, useName, password);
        return connection;
    }

    //释放连接
    public static void relese(Connection connection, Statement statement, ResultSet resultSet){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
