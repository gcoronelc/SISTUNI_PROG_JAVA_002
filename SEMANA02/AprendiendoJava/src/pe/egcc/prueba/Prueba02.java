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
    
  }

  private static void mostrar(Producto p) {
    System.out.println("--------");
    System.out.println("Nombre: " + p.getNombre());
    System.out.println("Precio: " + p.getPrecio());
    System.out.println("Stock: " + p.getStock());
    System.out.println("Activo: " + p.isActivo());
  }
}
