package pe.egcc.prueba;

import pe.egcc.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    Producto prod1 = new Producto();
    mostrar(prod1);
    
    prod1.setNombre("Auto 2017");
    prod1.setPrecio(25000.0);
    prod1.setStock(1);
    prod1.setActivo(false);
    mostrar(prod1);
    
  }

  private static void mostrar(Producto p) {
    System.out.println("--------");
    System.out.println("Nombre: " + p.getNombre());
    System.out.println("Precio: " + p.getPrecio());
    System.out.println("Stock: " + p.getStock());
    System.out.println("Activo: " + p.isActivo());
  }
}
