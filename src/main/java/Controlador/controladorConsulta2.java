package Controlador;

import Modelo.*;
import java.sql.*;

public class controladorConsulta2 {
    private modeloConsulta2 mdConsulta2;
     
    public controladorConsulta2() {
        this.mdConsulta2 = new modeloConsulta2();
    }
     
    public ResultSet getResult() {
        ResultSet r = this.mdConsulta2.getResult();
        return r;
    }
     
    /**
     * @return the mdConsulta1
     */
    public modeloConsulta2 getMdConsulta2() {
        return mdConsulta2;
    }

    /**
     * @param mdConsulta2 the mdConsulta2 to set
     */
    public void setMdConsulta2(modeloConsulta2 mdConsulta2) {
        this.mdConsulta2 = mdConsulta2;
    }
}
