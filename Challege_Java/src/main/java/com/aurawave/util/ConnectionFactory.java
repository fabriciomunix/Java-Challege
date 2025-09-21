package com.aurawave.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public static Connection getConnection(){
        try{
            String url = System.getenv().getOrDefault("DB_URL","jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
            String user = System.getenv().getOrDefault("DB_USER","sa");
            String pass = System.getenv().getOrDefault("DB_PASS","");
            return DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
