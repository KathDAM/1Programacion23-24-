//Catherine AM
package unidad5.ejercicio3;

public class PuntoTest {
    public static void main(String[] args) {
        Punto puntos = new Punto();
// Primer punto en el origen
Punto punto1 = new Punto(0, 0);

// Segundo punto en (5, 3)
Punto punto2 = new Punto(5, 3);

// Tercer punto en (2, -1)
Punto punto3 = new Punto(2, -1);

// Calcular el punto medio entre el segundo y tercer punto
Punto puntoMedio = new Punto((punto2.x + punto3.x) / 2, (punto2.y + punto3.y) / 2);

// Mostrar los puntos
System.out.println("Punto 1: (" + punto1.x + ", " + punto1.y + ")");
System.out.println("Punto 2: (" + punto2.x + ", " + punto2.y + ")");
System.out.println("Punto 3: (" + punto3.x + ", " + punto3.y + ")");
System.out.println("Punto Medio: (" + puntoMedio.x + ", " + puntoMedio.y + ")");

        
    }
}
