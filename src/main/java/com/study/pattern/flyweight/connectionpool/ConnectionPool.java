package com.study.pattern.flyweight.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class ConnectionPool {
    private Vector<Connection> pool;
    private int poolSize = 100;
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";
    public ConnectionPool(){
        pool = new Vector<Connection>(poolSize);
        try{
            Class.forName(driverClassName);
            for(int i = 0; i < poolSize; i ++){
                Connection connection = DriverManager.getConnection(url, username, password);
                pool.add(connection);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection(){
        if(pool.size()>0){
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }
        return null;
    }

    public synchronized void release(Connection conn){
        pool.add(conn);
    }
}
