package com.devil.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * ClassName：JDBCUtil
 *
 * @author: Devil
 * @Date: 2024/8/28
 * @Description:
 * @version: 1.0
 */
public class JDBCUtil_ptimize {
    private static String driver = null;
    private static String url = null;
    private static String useName =null;
    private static String password = null;

    static {
        try {
            //读取文件信息
            InputStream resourceAsStream = JDBCUtil_ptimize.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);

            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            useName = properties.getProperty("useName");
            password = properties.getProperty("password");

            //加载驱动，一次就够了
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
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
