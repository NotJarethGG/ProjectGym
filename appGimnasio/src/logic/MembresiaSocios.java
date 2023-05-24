package logic;



public class MembresiaSocios {

    private int idMembresiaSocios;
    private int idMembresia;
    private int idSocio;
    private String fechaIni;
    private String fechaFin;
    private byte activo;
    
    

    public MembresiaSocios(int idMembresiaSocios, int idMembresia, int idSocio, String fechaIni, String fechaFin, byte activo) {
        this.idMembresiaSocios = idMembresiaSocios;
        this.idMembresia = idMembresia;
        this.idSocio = idSocio;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.activo = activo;
    }

    public MembresiaSocios() {
    }

    public int getIdMembresiaSocios() {
        return idMembresiaSocios;
    }

    public void setIdMembresiaSocios(int idMembresiaSocios) {
        this.idMembresiaSocios = idMembresiaSocios;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public byte getActivo() {
        return activo;
    }

    public void setActivo(byte activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "MembresiaSocios{" + "idMembresiaSocios=" + idMembresiaSocios + ", idMembresia=" + idMembresia + ", idSocio=" + idSocio + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", activo=" + activo + '}';
    }

}
