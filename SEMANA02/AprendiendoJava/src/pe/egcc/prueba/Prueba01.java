package pe.egcc.prueba;

import pe.egcc.model.Trabajador;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Trabajador trabajador;
    trabajador = new Trabajador();
    System.out.println("Salario: " + trabajador.obtenerSalario(3));
  }
  
}
