package segundaev.ejemplos.ejemplo2;

public class Vehiculo {
    public int velocidad;
    public int ruedas;
    public float distancia = 0f;

    public void parar(){
        velocidad = 0;
    }

    public void acelerar(int kmh){
        velocidad += kmh;
    }   

    public void avanzar(int km){
        this.distancia += km;
        System.out.println("Avanza: " + km + " km.");
    }   
    

    public void imprimir(){
        System.out.println("Datos Vehiculo: Velocidad- " + velocidad + " , Ruedas- " + ruedas +  ".");
    }
}
