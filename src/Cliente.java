public class Cliente {
  // Atributo
  private String nombre;
  private String apellido;

  // Cosntructor
  public Cliente(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  // Getter
  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  @Override
  public String toString() {
    return nombre + " " + apellido;
  }
}
