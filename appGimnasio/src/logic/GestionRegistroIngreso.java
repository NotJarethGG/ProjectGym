package logic;

import connect.Conexion;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GestionRegistroIngreso extends Conexion {

    public GestionRegistroIngreso() {

    }

    public ResultSet listarRegistroIngreso() {
        try {
            String call = "CALL ps_registroingreso_listar";
            obj_Procedimiento = conexion.prepareCall(call);
            rs = obj_Procedimiento.executeQuery();
        } catch (SQLException e) {
            System.err.println(e);
            desconectarBD();
        } catch (Exception e) {
            System.err.println(e);
            desconectarBD();
        }
        return rs;
    }
//

    public boolean insertarRegistroIngreso(RegistroIngreso registroingreso) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_registroingreso_insertar(?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, registroingreso.getIdSocio());
            obj_Procedimiento.setString(2, registroingreso.getFecha());
            obj_Procedimiento.setString(3, registroingreso.getHoraInicio());
            obj_Procedimiento.setString(4, registroingreso.getHoraSalida());
            obj_Procedimiento.setString(5, registroingreso.getDescripcion());

            upt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();

        } catch (SQLException ex) {
            System.err.println(ex);
            desconectarBD();
        } catch (Exception ex) {
            System.err.println(ex);
            desconectarBD();
        }
        return upt;
    }

    public RegistroIngreso buscarRegistroIngreso(int idRegistroIngreso) {
        RegistroIngreso registroingreso = null;
        try {
            conectarBD();
            String call = "{CALL ps_registroingreso_buscar(?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, idRegistroIngreso);
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                registroingreso = new RegistroIngreso();
                registroingreso.setIdSocio(rs.getInt(1));
                registroingreso.setFecha(rs.getString(2));
                registroingreso.setHoraInicio(rs.getString(3));
                registroingreso.setHoraSalida(rs.getString(4));
                registroingreso.setDescripcion(rs.getString(5));

            }
            desconectarBD();

        } catch (SQLException ex) {
            System.err.println(ex);
            desconectarBD();
        } catch (Exception ex) {
            System.err.println(ex);
            desconectarBD();
        }
        return registroingreso;
    }

    public void cargarReporteRegistroIngreso() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/reports/rptRegistroIngreso.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reporte, null, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }

    public void consultarIDSocios(JComboBox cboxID) {
        conectarBD();
        String SSQL = "SELECT idSocio FROM tblsocios";
        try {
            obj_Procedimiento = conexion.prepareCall(SSQL);
            rs = obj_Procedimiento.executeQuery();
            while (rs.next()) {
                cboxID.addItem(rs.getString("idSocio"));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
                public ResultSet seleccionarIdSocio(int idSocio) {
        Connection cn = null;
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            conectarBD();
            String Call = "SELECT * FROM tblregistroingreso WHERE idSocio=?";
            pst = conexion.prepareStatement(Call);
             pst.setInt(1, idSocio);
            rs = pst.executeQuery();
        } catch (SQLException e) {
        }

        return rs;
    }
    public ResultSet seleccionarIdRegistroIngreso(int idRegistroIngreso) {
        Connection cn = null;
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            conectarBD();
            String Call = "SELECT * FROM tblregistroingreso WHERE idRegistroIngreso=?";
            pst = conexion.prepareStatement(Call);
             pst.setInt(1,idRegistroIngreso);
            rs = pst.executeQuery();
        } catch (SQLException e) {
        }

        return rs;
    }
public ResultSet seleccionarFecha(String fecha) {
        Connection cn = null;
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            conectarBD();
            String Call = "SELECT * FROM tblregistroingreso WHERE fecha=?";
            pst = conexion.prepareStatement(Call);
             pst.setString(1,fecha);
            rs = pst.executeQuery();
        } catch (SQLException e) {
        }

        return rs;
    }
public void cargarReporteUnRegistroIngreso(int idRegistroIngreso) {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
//direccion del archivo JASPER, toma la direccion del sistema
            URL in = this.getClass().getResource("/reports/rptUnRegistroIngreso.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
//Se crea un objeto HashMap
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("pidRegistroIngreso", idRegistroIngreso);
            reporte_view = JasperFillManager.fillReport(reporte, parametros, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }
}
