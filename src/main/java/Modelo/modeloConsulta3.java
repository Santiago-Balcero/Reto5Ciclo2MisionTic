package Modelo;

import java.sql.*;

public class modeloConsulta3 {
    public static ResultSet getResult() {
        Statement stmt = null;
        ResultSet result = null;
        try {
            var conn = dbData.getConnection();
            String query = "SELECT ID_Compra AS ID, Constructora AS CONSTRUCTORA, Banco_Vinculado AS BANCO FROM Compra JOIN Proyecto ON Compra.ID_Proyecto = Proyecto.ID_Proyecto WHERE Proveedor = 'Homecenter' AND Ciudad = 'Salento';";
            stmt = conn.createStatement();
            result = stmt.executeQuery(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
