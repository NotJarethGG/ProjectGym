
package logic;

import connect.Conexion;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GestionMembresiaSocios extends Conexion {

    public GestionMembresiaSocios() {

    }

    public ResultSet listarMembresiaSocios() {
        try {
            String call = "CALL ps_membresocios_listar";
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

    public boolean insertarMembresiaSocios(MembresiaSocios membresocio) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_membresocios_insertar(?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, membresocio.getIdMembresia());
            obj_Procedimiento.setInt(2, membresocio.getIdSocio());
            obj_Procedimiento.setString(3, membresocio.getFechaIni());
            obj_Procedimiento.setString(4, membresocio.getFechaFin());
            obj_Procedimiento.setByte(5, membresocio.getActivo());
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

    public boolean editarMembresiaSocios(MembresiaSocios membresocio) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_membresocios_editar(?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, membresocio.getIdMembresia());
            obj_Procedimiento.setInt(2, membresocio.getIdSocio());
            obj_Procedimiento.setString(3, membresocio.getFechaIni());
            obj_Procedimiento.setString(4, membresocio.getFechaFin());
            obj_Procedimiento.setByte(5, membresocio.getActivo());
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

    public boolean eliminarMembresiaSocios(int idMembresiaSocios) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_membresocios_eliminar(?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, idMembresiaSocios);

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

    public MembresiaSocios buscarMembresiaSocios(int idMembresiaSocios) {
        MembresiaSocios membresiasocio = null;
        try {
            conectarBD();
            String call = "{CALL ps_membresocios_buscar(?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, idMembresiaSocios);
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                membresiasocio = new MembresiaSocios();
                membresiasocio.setIdMembresiaSocios(rs.getInt(1));
                membresiasocio.setIdMembresia(rs.getInt(2));
                membresiasocio.setIdSocio(rs.getInt(3));
                membresiasocio.setFechaIni(rs.getString(4));
                membresiasocio.setFechaFin(rs.getString(5));
                membresiasocio.setActivo(rs.getByte(6));
            }
            desconectarBD();

        } catch (SQLException ex) {
            System.err.println(ex);
            desconectarBD();
        } catch (Exception ex) {
            System.err.println(ex);
            desconectarBD();
        }
        return membresiasocio;
    }

    public void cargarReporteMembresiaSocios() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/reports/rptMembresiaSocio.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reporte, null, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }
    
    public void consultarIDMembresias(JComboBox cboxID){
        conectarBD();
        String SSQL = "SELECT idMembresia FROM tblmembresias";
    try{
     obj_Procedimiento = conexion.prepareCall(SSQL);
            rs = obj_Procedimiento.executeQuery();
            while(rs.next()){
            cboxID.addItem(rs.getString("idMembresia"));
            }
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
    
    }
    
    public void consultarIDSocios(JComboBox cboxID){
        conectarBD();
        String SSQL = "SELECT idSocio FROM tblsocios";
    try{
     obj_Procedimiento = conexion.prepareCall(SSQL);
            rs = obj_Procedimiento.executeQuery();
            while(rs.next()){
            cboxID.addItem(rs.getString("idSocio"));
            }
    
    }
    catch(SQLException e){
        System.out.println(e);
    }
    
    }
    
    public void cargarReporteUnaMembresiaSocio(int idMembresiaSocio) {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
//direccion del archivo JASPER, toma la direccion del sistema
            URL in = this.getClass().getResource("/reports/rptUnaMembresiaSocio.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
//Se crea un objeto HashMap
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("pidMembresiaSocio", idMembresiaSocio);
            reporte_view = JasperFillManager.fillReport(reporte, parametros, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {
            System.err.println(ex.toString());
        }
    }

}
