package segundaev.herencia2.ejer1;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
       // Producto prod1 = new Producto(0147, "Movil iphone 11", 350.90, Calendar.getInstance());

        EquipoInformatico equipo = new EquipoInformatico(123, "Ordenador portátil", 999.99, Calendar.getInstance(),8, 500, "Windows 10", 2.5);

        Movil movil = new Movil(789, "Teléfono Samsung Galaxy", 599.99, Calendar.getInstance(),"Samsung", "Galaxy S20");
    
           // Muestra información de los productos
           System.out.println(equipo);
           System.out.println(movil);
   
           // Compara productos por código
           System.out.println("¿Son los mismos productos?: " + movil.esIgualCodigo(equipo));
   
           presupuestosProductos( equipo, movil);
    }

    public static void presupuestosProductos(Producto... productos){ //nombramos clase padre 
        System.out.println("Presupuesto de Venta:");
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            Producto producto = productos[i];
            total += producto.getPrecio();
            System.out.println(" - " + producto);
        }
        System.out.println("   Total: " + total + " euros");
    }

}
