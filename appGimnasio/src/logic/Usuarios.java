
package logic;


public class Usuarios {
    
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String user;
    private String correo;
    private String telefono;
    private String pass;
    private String area;
    
    public Usuarios(){
    }

    public Usuarios(int idUsuario, String nombre, String apellidos, String user, String correo, String telefono, String pass, String area) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.user = user;
        this.correo = correo;
        this.telefono = telefono;
        this.pass = pass;
        this.area = area;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellidos=" + apellidos + ", user=" + user + ", correo=" + correo + ", telefono=" + telefono + ", pass=" + pass + ", area=" + area + '}';
    }
    
    
    
    
}
