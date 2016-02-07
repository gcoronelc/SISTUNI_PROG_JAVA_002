package pe.egcc.prueba;

import pe.egcc.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {
  
  public static void main(String[] args) {
    
    Producto prod1 = new Producto();
    
    Producto prod2 = new Producto("Televisor", 3678.90);
    
    Producto prod3 = new Producto("Televisor", 3678.90, 50, true);
    
  }
}
