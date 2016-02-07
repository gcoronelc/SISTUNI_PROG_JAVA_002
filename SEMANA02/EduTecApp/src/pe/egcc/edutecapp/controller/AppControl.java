package pe.egcc.edutecapp.controller;

import pe.egcc.app.lib.Promedio;

/**
 *
 * @author Gustavo Coronel
 */
public class AppControl {

  private Promedio service;

  public AppControl() {
    service = new Promedio();
  }

  public int promediar(int n1, int n2) {
    return service.promediar(n1, n2);
  }

}
