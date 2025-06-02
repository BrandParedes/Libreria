public class FacturaDetalle {
    private int idDetalle;
    private Libro libro;      // Inyección de dependencia
    private int cantidad;
    private double subtotal;

    public FacturaDetalle() {}

    public FacturaDetalle(int idDetalle, Libro libro, int cantidad, double subtotal) {
        this.idDetalle = idDetalle;
        this.libro = libro;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getIdDetalle() { return idDetalle; }
    public void setIdDetalle(int idDetalle) { this.idDetalle = idDetalle; }

    public Libro getLibro() { return libro; }
    public void setLibro(Libro libro) { this.libro = libro; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
}
