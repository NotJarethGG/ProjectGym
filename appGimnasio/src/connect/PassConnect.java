package connect;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import logic.Usuarios;


public class PassConnect {

    private static Connection mConection;
    private static Statement mStatement;
    private static ResultSet mResultSet;
    private final String bd;
    private final String users;
    private final String pass;

    public PassConnect(String bd, String users, String pass) {
        mConection = null;
        mStatement = null;
        mResultSet = null;
        this.bd = bd;
        this.users = users;
        this.pass = pass;
    }

    public boolean Conectar() {
        try {
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
            mConection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/" + bd, users, pass);
            return mConection != null;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void Desconectar() {
        try {
            this.mConection.close();
        } catch (Exception e) {
        }
    }
 
    
    public Boolean AddUser(Usuarios user) {
          try {
            mStatement = mConection.createStatement();
            mStatement.execute("INSERT INTO tblusers (users, nombre, apellidos, telefono, correo, pass, area) "
            + " VALUES ('" + user.getUser()+ "','"+ user.getNombre() + "','" + user.getApellidos()+"','" + user.getTelefono()+ "','" + user.getCorreo()+ "','"  + user.getPass()+ "','"  + user.getArea()+ "')");
            return true;
        } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }
    }
    
    public Usuarios GetUsuario(String usuario) {
        Usuarios user = null;
         try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM tblusers WHERE users = '" + usuario + "' ");
            while (mResultSet.next()){
                user = new Usuarios();
                user.setIdUsuario(mResultSet.getInt("idUsers"));
                user.setUser(mResultSet.getString("users"));
                user.setNombre(mResultSet.getString("nombre"));
                user.setApellidos(mResultSet.getString("apellidos"));
                user.setTelefono(mResultSet.getString("telefono"));
                user.setCorreo(mResultSet.getString("correo"));
                user.setPass(mResultSet.getString("pass"));
                user.setArea(mResultSet.getString("area"));
                return user;
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
        return user;
    } 
    

}
