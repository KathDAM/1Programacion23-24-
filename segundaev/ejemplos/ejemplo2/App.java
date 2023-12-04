package segundaev.ejemplos.ejemplo2;

public class App {
        public static void main(String[] args) {
        //Horario horario1 = new Horario();
        Vehiculo vehiculo = new Vehiculo();
        Coche coche1 = new Coche();

        coche1.acelerar(80); 
        coche1.repostar(0);
        vehiculo.imprimir();
        coche1.imprimir();
        vehiculo.avanzar(10);
        coche1.avanzar(10);
    }
}
