public class Producto {
  // Atributos
  private String fabricante;
  private String nombre;
  private int precio;

  // Constructor
  public Producto(String fabricante, String nombre, int precio) {
    this.fabricante = fabricante;
    this.nombre = nombre;
    this.precio = precio;
  }

  // Getter
  public String getFabricante() {
    return fabricante;
  }

  public String getNombre() {
    return nombre;
  }

  public int getPrecio() {
    return precio;
  }

}
