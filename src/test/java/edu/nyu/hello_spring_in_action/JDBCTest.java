package edu.nyu.hello_spring_in_action;

import org.junit.Test;

import java.sql.*;

public class JDBCTest {

    @Test
    public void testInsert() {
        String url = "jdbc:mysql://localhost:3306/crashcourse";
        String driver = "com.mysql.cj.jdbc.Driver";
        String userName = "root";
        String password = "1143101";

        Connection connection = null;
        Statement statement = null;
        try {
            //1加载驱动类

            Class.forName(driver);
            //2获取数据库连接对象
            connection = DriverManager.getConnection(url, userName, password);
            //3获取sql命令对象
            statement = connection.createStatement();

            //4创建sql命令
            String sql = "INSERT INTO t_users VALUES(12,31,'kkj',1)";
            //5指定sql命令
            int i = statement.executeUpdate(sql);
            System.out.println("执行结果：" + i);

        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
        } catch (SQLException e) {
//            e.printStackTrace();
        } finally {
            //6关闭资源
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testUpdate() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/crashcourse";
        String userName = "root";
        String password = "1143101";
        Connection connection = null;
        Statement statement = null;
        try {
            //1加载驱动类
            Class.forName(driver);
            //2获取数据库连接
            connection = DriverManager.getConnection(url, userName, password);
            //3获取sql命令对象
            statement = connection.createStatement();
            //4创建sql语句
            String name = "lisi";
            String sql = "UPDATE t_users SET NAME = '" + name + "' WHERE id = 11";
            //5执行查询
            int i = statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            //
        } catch (SQLException e) {
            //
        } finally {
            try {
                //关闭资源
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void testDel() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/crashcourse";
        String userName = "root";
        String password = "1143101";
        Connection connection = null;
        Statement statement = null;
        try {
            //1加载类
            Class.forName(driver);
            //2建立连接
            connection = DriverManager.getConnection(url, userName, password);
            //3获取查询对象
            statement = connection.createStatement();
            //4创建查询语句
            String name = "zhangsan";
            String sql = "DELETE FROM t_users WHERE NAME = '" + name + "'";
            //5执行sql
            int i = statement.executeUpdate(sql);
            System.out.println("删除量：" + i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void testRead() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/crashcourse";
        String userName = "root";
        String password = "1143101";
        Connection connection = null;
        Statement statement = null;
        try {
            //1加载类
            Class.forName(driver);
            //2建立连接
            connection = DriverManager.getConnection(url, userName, password);
            //3获取查询对象
            statement = connection.createStatement();
            //4创建查询语句
            String sql = "SELECT * FROM t_users";
            //5执行sql
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String s = resultSet.getString(3);
                System.out.println(s);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
