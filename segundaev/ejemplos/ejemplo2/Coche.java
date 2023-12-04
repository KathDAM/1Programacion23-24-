package segundaev.ejemplos.ejemplo2;

public class Coche extends Vehiculo {
    public int ruedas = 4;
    public float gasolina;
    public float consumo;

    public void repostar(int litros){
        gasolina += litros;
    }

    public void avanzar(int km){
        if (gasolina == 0) {
            System.out.println("No avanza, km a 0.");
        } else {
            distancia += km;
            System.out.println("Avanza: " + km + " km.");
        }
    }  

    public void imprimir(){
        System.out.println("Datos Coche: Velocidad- " + velocidad + " , Ruedas- " + ruedas + " y Gasolina- " + gasolina +".");
    }
}
