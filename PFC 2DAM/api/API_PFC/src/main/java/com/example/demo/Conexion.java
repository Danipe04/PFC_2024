package com.example.demo;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    static {
        config.setJdbcUrl("jdbc:sqlserver://localhost:1433;");
        config.setUsername("sa");
        config.setPassword("ADMIN0");
        config.addDataSourceProperty("database", "RESTAURANTE");
        config.addDataSourceProperty("encrypt", "true");
        config.addDataSourceProperty("trustServerCertificate", "true");
        config.addDataSourceProperty("loginTimeout", "30");
        ds = new HikariDataSource(config);
    }

    public static Connection obtenerConexion() throws SQLException {
        return ds.getConnection();
    }
}