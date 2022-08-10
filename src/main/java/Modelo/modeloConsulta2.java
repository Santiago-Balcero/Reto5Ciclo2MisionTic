package Modelo;

import java.sql.*;

public class modeloConsulta2 {
    public static ResultSet getResult() {
        Statement stmt = null;
        ResultSet result = null;
        try {
            var conn = dbData.getConnection();
            String query = "SELECT ID_Proyecto AS ID, Constructora AS CONSTRUCTORA, Numero_Habitaciones AS HABITACIONES, Ciudad AS CIUDAD FROM Proyecto WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Barranquilla', 'Cartagena', 'Santa Marta');";
            stmt = conn.createStatement();
            result = stmt.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
