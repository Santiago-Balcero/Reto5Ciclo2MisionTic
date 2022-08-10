package Controlador;

import Modelo.*;
import java.sql.*;

public class controladorConsulta1 {
    private modeloConsulta1 mdConsulta1;
    
    public controladorConsulta1() {
        this.mdConsulta1 = new modeloConsulta1();
    }
    
    public ResultSet getResult() {
        ResultSet r = this.mdConsulta1.getResult();
        return r;
    }

    /**
     * @return the mdConsulta1
     */
    public modeloConsulta1 getMdConsulta1() {
        return mdConsulta1;
    }

    /**
     * @param mdConsulta1 the mdConsulta1 to set
     */
    public void setMdConsulta1(modeloConsulta1 mdConsulta1) {
        this.mdConsulta1 = mdConsulta1;
    }
}
