package Modelo;

import java.sql.*;

public class dbData {
    private static final String UBICACION_BD = "C:\\Users\\Santiago\\Documents\\NetBeansProjects\\Reto5\\ProyectosConstruccion.db";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
}
