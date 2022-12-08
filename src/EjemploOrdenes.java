import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

      // primera orden de compra
      OrdenCompra ordenOne = new OrdenCompra("Compras productos limpieza");
      ordenOne.setCliente(new Cliente("Damian", "Olmedo"));
      ordenOne.setFecha(new Date());

     ordenOne.addProducto(new Producto("Ayudin", "Lavandina", 200)); 
     ordenOne.addProducto(new Producto("Lisofon", "Desodorante", 1000)); 
     ordenOne.addProducto(new Producto("Magistral", "Destergente", 450)); 
     ordenOne.addProducto(new Producto("Patito", "Esponja", 500)); 

     // segunda orden de compra
     OrdenCompra ordenTwo = new OrdenCompra("Compra Articulos Libreria");
     ordenTwo.setCliente(new Cliente("Camila", "Gonzalez"));
     ordenTwo.setFecha(new Date());

     ordenTwo.addProducto(new Producto("Pentel", "Cuaderno", 1800)); 
     ordenTwo.addProducto(new Producto("Bic", "Lapicera", 800)); 
     ordenTwo.addProducto(new Producto("fabercastle", "boligoma", 200)); 
     ordenTwo.addProducto(new Producto("Ledesma", "Hojas", 700)); 

     // tercera orden de compra
     OrdenCompra ordenThree = new OrdenCompra("Compra de bebidas");
     ordenThree.setCliente(new Cliente("Nicolas", "lopez"));
     ordenThree.setFecha(new Date());

     ordenThree.addProducto(new Producto("Sprite", "Gaseosa", 600)); 
     ordenThree.addProducto(new Producto("Heineken", "Cerveza", 900)); 
     ordenThree.addProducto(new Producto("Tang", "Jugo", 700)); 
     ordenThree.addProducto(new Producto("San Felipe", "Vino", 2000)); 


     OrdenCompra[] ordenes = {ordenOne, ordenTwo, ordenThree};

     for(OrdenCompra orden: ordenes) {
       System.out.println("Identificador: " + orden.getIdentificador());
       System.out.println("Cliente: " + orden.getCliente());
       System.out.println("Descripcion: " + orden.getDescripcion());
       System.out.println("Fecha: " + orden.getFecha());
       System.out.println("Total: " + orden.getGranTotal());
    
       int i = 1;
       for(Producto p: orden.getProductos()) {
           System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
           i++;
          }
       System.out.println("===============================================");
       }
  }
}
