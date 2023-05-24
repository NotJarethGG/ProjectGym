package logic;



public class Membresias {
    private int idMembresia;
    private String nombre;
    private String descripcion;
    private String periodo;
    private double precio;

    
    public Membresias() {
    }

    public Membresias(int idMembresia, String nombre, String descripcion, String periodo, double precio) {
        this.idMembresia = idMembresia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.periodo = periodo;
        this.precio = precio;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Membresias{" + "idMembresia=" + idMembresia + ", nombre=" + nombre + ", descripcion=" + descripcion + ", periodo=" + periodo + ", precio=" + precio + '}';
    }

    
    
    
}
