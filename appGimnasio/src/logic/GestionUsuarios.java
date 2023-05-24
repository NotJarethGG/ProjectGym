package logic;

import connect.Conexion;
import java.sql.SQLException;

public class GestionUsuarios extends Conexion {
    
    

    public GestionUsuarios() throws SQLException {
        
    }


public boolean insertarUsuarios(Usuarios user) {
        boolean upt = false;
        try {
            conectarBD();
            String call = "{CALL ps_usuarios_insertar(?,?,?,?,?,?,?,?)}";
            obj_Procedimiento = conexion.prepareCall(call);
            obj_Procedimiento.setInt(1, user.getIdUsuario());
            obj_Procedimiento.setString(2, user.getUser());
            obj_Procedimiento.setString(3, user.getNombre());
            obj_Procedimiento.setString(4, user.getApellidos());
            obj_Procedimiento.setString(5, user.getTelefono());
            obj_Procedimiento.setString(6, user.getCorreo());
            obj_Procedimiento.setString(7, user.getPass());
            obj_Procedimiento.setString(8, user.getArea());
            

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
    public String buscarUsuarioRegistrado(String User) {
        String busqueda_usuario = null;
        EncriptarPassword desencrip = new EncriptarPassword();
        
//        Pass = desencrip.deecnode(user.getPass());

        try {
            conectarBD();
//String Procedimiento
//                    = "SELECT users, pass from tblusers where users  = '" + User + "' and pass = '" + Pass + "'";
            String Procedimiento
                    = "SELECT users from tblusers where users  = '" + User + "'";
            obj_Procedimiento = conexion.prepareCall(Procedimiento);
            rs = obj_Procedimiento.executeQuery();

            if (rs.next()) {
                busqueda_usuario = "Encontrado";
            } else {
                busqueda_usuario = "No encontrado";
            }

            desconectarBD();
        } catch (SQLException ex) {
            desconectarBD();
            System.err.print(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.print(ex);
        }
        return busqueda_usuario;

    }
    
    
}
