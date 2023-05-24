package logic;

public class Socios {

//Variables de la clase socios
    private int idSocio;
    private String nombre;
    private String primerApe;
    private String segundoApe;
    private String telefonoMovil;
    private String telefonoFijo;
    private String correo;

    //Constructor vacio
    public Socios() {
    }

    //Constructor con parametros 
    public Socios(int idSocio, String nombre, String primerApe, String segundoApe, String telefonoMovil, String telefonoFijo, String correo) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.primerApe = primerApe;
        this.segundoApe = segundoApe;
        this.telefonoMovil = telefonoMovil;
        this.telefonoFijo = telefonoFijo;
        this.correo = correo;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApe() {
        return primerApe;
    }

    public void setPrimerApe(String primerApe) {
        this.primerApe = primerApe;
    }

    public String getSegundoApe() {
        return segundoApe;
    }

    public void setSegundoApe(String segundoApe) {
        this.segundoApe = segundoApe;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Socios{" + "idSocio=" + idSocio + ", nombre=" + nombre + ", primerApe=" + primerApe + ", segundoApe=" + segundoApe + ", telefonoMovil=" + telefonoMovil + ", telefonoFijo=" + telefonoFijo + ", correo=" + correo + '}';
    }

}
