package Datos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/* @author Álvaro García Fernández */
public class BDA {

    private ResultSet rs;
    private Connection conn;
    private PreparedStatement ps;

    public BDA() {
 
    }
    public boolean conexion() {

        boolean resuesta = false;
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/parques", "root", "root");
            if (conn != null) {
                resuesta = true;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            resuesta = false;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            resuesta = false;
        }
        return resuesta;
    }
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public ResultSet getRs() {
        return rs;
    }

    public Connection getConn() {
        return conn;
    }

    public PreparedStatement getPs() {
        return ps;
    }
}
