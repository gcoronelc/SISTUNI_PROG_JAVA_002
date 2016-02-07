package pe.egcc.model;

/**
 *
 * @author GustavoCoronel
 */
public class Producto {

  private String nombre;
  private double precio;
  private int stock;
  private boolean activo;

  /**
   * Constructor por defecto
   */
  public Producto() {
    this.nombre = "Televisor de 80'";
    this.precio = 10500.0;
    this.stock = 200;
    this.activo = true;
    System.out.println("Objeto creado.");
  }

  /**
   * Constructor adicional.
   * 
   * @param nombre
   * @param precio
   */
  public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = 0;
    this.activo = false;
  }
  
  /**
   * Constructor adicional.
   * 
   * @param nombre
   * @param precio
   * @param stock
   * @param activo 
   */
  public Producto(String nombre, double precio, int stock, boolean activo) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
    this.activo = activo;
  }
  
  

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
    System.err.println("Chau objeto.");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
