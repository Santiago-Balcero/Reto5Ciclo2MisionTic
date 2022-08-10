package Controlador;

import Modelo.*;
import java.sql.*;

public class controladorConsulta3 {
    private modeloConsulta3 mdConsulta3;
    
    public controladorConsulta3() {
        this.mdConsulta3 = new modeloConsulta3();
    }
    
    public ResultSet getResult() {
        ResultSet r = this.mdConsulta3.getResult();
        return r;
    }
    
    /**
     * @return the mdConsulta3
     */
    public modeloConsulta3 getMdConsulta3() {
        return mdConsulta3;
    }

    /**
     * @param mdConsulta3 the mdConsulta3 to set
     */
    public void setMdConsulta3(modeloConsulta3 mdConsulta3) {
        this.mdConsulta3 = mdConsulta3;
    }
}
