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

public class GestionSocios extends Conexion {

    public GestionSocios() {

    }

    public ResultSet listarSocios() {
        try {
            String call = "CALL ps_socio_listar";
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

    public boolean insertarSocios(Socios socios) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_socio_insertar(?,?,?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, socios.getIdSocio());
            obj_Procedimiento.setString(2, socios.getNombre());
            obj_Procedimiento.setString(3, socios.getPrimerApe());
            obj_Procedimiento.setString(4, socios.getSegundoApe());
            obj_Procedimiento.setString(5, socios.getTelefonoMovil());
            obj_Procedimiento.setString(6, socios.getTelefonoFijo());
            obj_Procedimiento.setString(7, socios.getCorreo());

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

    public boolean editarSocios(Socios socios) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_socio_editar(?,?,?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, socios.getIdSocio());
            obj_Procedimiento.setString(2, socios.getNombre());
            obj_Procedimiento.setString(3, socios.getPrimerApe());
            obj_Procedimiento.setString(4, socios.getSegundoApe());
            obj_Procedimiento.setString(5, socios.getTelefonoMovil());
            obj_Procedimiento.setString(6, socios.getTelefonoFijo());
            obj_Procedimiento.setString(7, socios.getCorreo());
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

    public boolean eliminarSocio(int idSocio) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_socio_eliminar(?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, idSocio);

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

    public Socios buscarSocio(int idSocio) {
        Socios socios = null;
        try {
            conectarBD();
            String call = "{CALL ps_socio_buscar(?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, idSocio);
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                socios = new Socios();
                socios.setIdSocio(rs.getInt(1));
                socios.setNombre(rs.getString(2));
                socios.setPrimerApe(rs.getString(3));
                socios.setSegundoApe(rs.getString(4));
                socios.setTelefonoMovil(rs.getString(5));
                socios.setTelefonoFijo(rs.getString(6));
                socios.setCorreo(rs.getString(7));
            }
            desconectarBD();

        } catch (SQLException ex) {
            System.err.println(ex);
            desconectarBD();
        } catch (Exception ex) {
            System.err.println(ex);
            desconectarBD();
        }
        return socios;
    }

    public void cargarReporteSocios() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/reports/rptSocios.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reporte, null, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }

    public ResultSet seleccionarIdSocio(int idSocio) {
        Connection cn = null;
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            conectarBD();
            String Call = "SELECT * FROM tblsocios WHERE idSocio=?";
            pst = conexion.prepareStatement(Call);
            pst.setInt(1, idSocio);
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
            String Call = "SELECT * FROM tblsocios WHERE nombre=?";
            pst = conexion.prepareStatement(Call);
            pst.setString(1, nombre);
            rs = pst.executeQuery();
        } catch (SQLException e) {
        }

        return rs;
    }

    public ResultSet seleccionarPrimerApellido(String apellido1) {
        Connection cn = null;
        PreparedStatement pst;
        ResultSet rs = null;
        try {
            conectarBD();
            String Call = "SELECT * FROM tblsocios WHERE apellido1=?";
            pst = conexion.prepareStatement(Call);
            pst.setString(1, apellido1);
            rs = pst.executeQuery();
        } catch (SQLException e) {
        }

        return rs;
    }

    public void cargarReporteMaestroSocios() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/reports/rptMaestroDetalleSocio.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reporte, null, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }

    public void cargarReporteUnSocio(int idSocio) {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
//direccion del archivo JASPER, toma la direccion del sistema
            URL in = this.getClass().getResource("/reports/rptUnSocio.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
//Se crea un objeto HashMap
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("pidSocio", idSocio);
            reporte_view = JasperFillManager.fillReport(reporte, parametros, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }
}
