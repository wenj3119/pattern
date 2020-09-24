package com.study.pattern.flyweight.connectionpool;

import java.sql.Connection;

/**
 * @Author wenjun
 * @Date 2020/9/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
        System.out.println(connection);
    }
}
