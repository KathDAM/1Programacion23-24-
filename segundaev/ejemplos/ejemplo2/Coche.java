package segundaev.ejemplos.ejemplo2;

public class Coche extends Vehiculo {
    protected int ruedas = 4;
    protected float gasolina;
    protected float consumo;

    public void repostar(int litros){
        gasolina += litros;
    }

    public void avanzar(int km){
        if (gasolina != 0) {
            float consumoReal = km * consumo;

            if (gasolina >= consumoReal) {
                distancia += km;
                gasolina -= consumoReal;
                System.out.println("Avanza: " + km + " km.");
            } else {
                System.out.println("No avanza, no hay gasolina.");
            }

        } else {
            System.out.println("No avanza, no hay gasolina.");
        }
    }  

    public void imprimir(){
        System.out.println("Datos Coche: Velocidad- " + velocidad + " , Ruedas- " + ruedas + " y Gasolina- " + gasolina +".");
    }
}
