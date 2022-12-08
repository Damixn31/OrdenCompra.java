import java.util.Date;

public class OrdenCompra {
  private int identificador;
  private String descripcion;
  private Date fecha;
  private Cliente cliente;
  private Producto[] productos;

  private static int lastId;
  private int indexProductos;


//Constructor
  public OrdenCompra(String descripcion) {
    this.descripcion = descripcion;
    this.identificador = ++lastId;
    this.productos = new Producto[4];
  }


  // Getter
  public int getIdentificador() {
    return identificador;
  }

  public String getDescripcion(){
    return descripcion;
  }

  public Date getFecha() {
    return fecha;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Producto[] getProductos() {
    return productos;
  }
  
  // Setter
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void addProducto(Producto producto) {
    if(indexProductos < this.productos.length) {
      this.productos[indexProductos++] = producto;
    }
  }

  public int getGranTotal() {
    int total = 0;
    for(Producto p: productos) {
      total += p.getPrecio();
    }
    return total;

  }

 
}
