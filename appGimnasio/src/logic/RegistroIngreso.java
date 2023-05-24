package logic;


public class RegistroIngreso {

    private int idRegistroIngreso;
    private int idSocio;
    private String fecha;
    private String horaInicio;
    private String horaSalida;
    private String descripcion;

    public RegistroIngreso(int idRegistroIngreso, int idSocio, String fecha, String horaInicio, String horaSalida, String descripcion) {
        this.idRegistroIngreso = idRegistroIngreso;
        this.idSocio = idSocio;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaSalida = horaSalida;
        this.descripcion = descripcion;
    }

    public RegistroIngreso() {

    }

    public int getIdRegistroIngreso() {
        return idRegistroIngreso;
    }

    public void setIdRegistroIngreso(int idRegistroIngreso) {
        this.idRegistroIngreso = idRegistroIngreso;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "RegistroIngreso{" + "idRegistroIngreso=" + idRegistroIngreso + ", idSocio=" + idSocio + ", fecha=" + fecha + ", horaInicio=" + horaInicio + ", horaSalida=" + horaSalida + ", descripcion=" + descripcion + '}';
    }

}
