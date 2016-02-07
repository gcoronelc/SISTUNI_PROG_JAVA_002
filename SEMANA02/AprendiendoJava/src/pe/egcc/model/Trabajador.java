package pe.egcc.model;

/**
 * Esta clase da servicios referidos al trabajador.
 * 
 * @author Gustavo Coronel
 */
public class Trabajador {
  
  /**
   * Este método retorna el salario de un trabajador
   * segun su categoria.
   * 
   * @param categoria Categoria del trabajador.
   * @return Retorna el salario en función de su categoría.
   */
  public double obtenerSalario(int categoria){
    double salario = 0.0;
    switch(categoria){
      case 1:
        salario = 1500.0;
        break;
      case 2:
        salario = 3500.0;
        break;
      case 3:
        salario = 6500.0;
        break;
    }
    return salario;
  }
    
}
