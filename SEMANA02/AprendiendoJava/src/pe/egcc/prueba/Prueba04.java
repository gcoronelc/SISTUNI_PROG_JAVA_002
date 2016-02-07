package pe.egcc.prueba;

import pe.egcc.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    MateService service = new MateService();
    System.out.println("7 + 8 = " + service.sumar(7, 8));
    System.out.println("7.0 + 8 = " + service.sumar(7.0, 8));
    System.out.println("7 + 8.0 = " + service.sumar(7, 8.0));
    System.out.println("7.0 + 8.0 = " + service.sumar(7.0, 8.0));
  }
  
}
