package Modelo;

import java.sql.*;

public class modeloConsulta1 {
    public static ResultSet getResult() {
        Statement stmt = null;
        ResultSet result = null;
        try {
            var conn = dbData.getConnection();
            String query = "SELECT ID_Lider AS ID, Nombre AS NOMBRE, Primer_Apellido AS APELLIDO, Ciudad_Residencia AS CIUDAD FROM Lider ORDER BY CIUDAD ASC;";
            stmt = conn.createStatement();
            result = stmt.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
