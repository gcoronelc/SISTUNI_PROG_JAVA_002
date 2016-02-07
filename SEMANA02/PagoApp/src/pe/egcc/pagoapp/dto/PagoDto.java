package pe.egcc.pagoapp.dto;

/**
 *
 * @author Gustavo Coronel
 */
public class PagoDto {

  // Datos
  private int horasDia;
  private int dias;
  private double pagoHora;
  // Resultado
  private double imgresos;
  private double renta;
  private double neto;

  public PagoDto() {
  }

  /**
   * @return the horasDia
   */
  public int getHorasDia() {
    return horasDia;
  }

  /**
   * @param horasDia the horasDia to set
   */
  public void setHorasDia(int horasDia) {
    this.horasDia = horasDia;
  }

  /**
   * @return the dias
   */
  public int getDias() {
    return dias;
  }

  /**
   * @param dias the dias to set
   */
  public void setDias(int dias) {
    this.dias = dias;
  }

  /**
   * @return the pagoHora
   */
  public double getPagoHora() {
    return pagoHora;
  }

  /**
   * @param pagoHora the pagoHora to set
   */
  public void setPagoHora(double pagoHora) {
    this.pagoHora = pagoHora;
  }

  /**
   * @return the imgresos
   */
  public double getImgresos() {
    return imgresos;
  }

  /**
   * @param imgresos the imgresos to set
   */
  public void setImgresos(double imgresos) {
    this.imgresos = imgresos;
  }

  /**
   * @return the renta
   */
  public double getRenta() {
    return renta;
  }

  /**
   * @param renta the renta to set
   */
  public void setRenta(double renta) {
    this.renta = renta;
  }

  /**
   * @return the neto
   */
  public double getNeto() {
    return neto;
  }

  /**
   * @param neto the neto to set
   */
  public void setNeto(double neto) {
    this.neto = neto;
  }

}
