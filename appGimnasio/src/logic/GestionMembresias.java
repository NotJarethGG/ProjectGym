package logic;

import connect.Conexion;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GestionMembresias extends Conexion {

    public GestionMembresias() {

    }

    public ResultSet listarMembresias() {
        try {
            String call = "CALL ps_membresia_listar";
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

    public boolean insertarMembresia(Membresias membresias) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_membresia_insertar(?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, membresias.getIdMembresia());
            obj_Procedimiento.setString(2, membresias.getNombre());
            obj_Procedimiento.setString(3, membresias.getDescripcion());
            obj_Procedimiento.setString(4, membresias.getPeriodo());
            obj_Procedimiento.setDouble(5, membresias.getPrecio());
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

    public boolean editarMembresia(Membresias membresias) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_membresia_editar(?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, membresias.getIdMembresia());
            obj_Procedimiento.setString(2, membresias.getNombre());
            obj_Procedimiento.setString(3, membresias.getDescripcion());
            obj_Procedimiento.setString(4, membresias.getPeriodo());
            obj_Procedimiento.setDouble(5, membresias.getPrecio());
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

    public boolean eliminarMembresia(int idMembresia) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_membresia_eliminar(?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, idMembresia);

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

    public Membresias buscarMembresias(int idMembresia) {
        Membresias membresias = null;
        try {
            conectarBD();
            String call = "{CALL ps_membresia_buscar(?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, idMembresia);
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                membresias = new Membresias();
                membresias.setIdMembresia(rs.getInt(1));
                membresias.setNombre(rs.getString(2));
                membresias.setDescripcion(rs.getString(3));
                membresias.setPeriodo(rs.getString(4));
                membresias.setPrecio(rs.getDouble(5));
            }
            desconectarBD();

        } catch (SQLException ex) {
            System.err.println(ex);
            desconectarBD();
        } catch (Exception ex) {
            System.err.println(ex);
            desconectarBD();
        }
        return membresias;
    }

    public void cargarReporteMembresias() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/reports/rptMembresias.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reporte, null, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }

    public ResultSet seleccionaridMembresia(int idMembresia) {
        Connection cn = null;
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            conectarBD();
            String Call = "SELECT * FROM tblMembresias WHERE idMembresia=?";
            pst = conexion.prepareStatement(Call);
            pst.setInt(1, idMembresia);
            rs = pst.executeQuery();
        } catch (SQLException e) {
        }

        return rs;
    }

    public ResultSet seleccionarNombre(String nombre) {
        Connection cn = null;
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            conectarBD();
            String Call = "SELECT * FROM tblMembresias WHERE nombre like '"+nombre+"%'";
            pst = conexion.prepareStatement(Call);
            rs = pst.executeQuery();
        } catch (SQLException e) {
        }

        return rs;
    }

    public ResultSet seleccionarPeriodo(String periodo) {
        Connection cn = null;
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            conectarBD();
            String Call = "SELECT * FROM tblMembresias WHERE periodo=?";
            pst = conexion.prepareStatement(Call);
            pst.setString(1, periodo);
            rs = pst.executeQuery();
        } catch (SQLException e) {
        }

        return rs;
    }

    public void cargarReporteMaestroMembresia() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/reports/rptMaestroDetalleMembresia.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reporte, null, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }

    public void cargarReporteUnaMembresia(int idMembresia) {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
//direccion del archivo JASPER, toma la direccion del sistema
            URL in = this.getClass().getResource("/reports/rptUnaMembresia.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
//Se crea un objeto HashMap
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("pidMembresia", idMembresia);
            reporte_view = JasperFillManager.fillReport(reporte, parametros, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }

}
