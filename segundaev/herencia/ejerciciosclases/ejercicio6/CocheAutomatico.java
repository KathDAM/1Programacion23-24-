// Catherine AM
package segundaev.herencia.ejerciciosclases.ejercicio6;

public class CocheAutomatico extends Coche{

    // CONSTRUCTOR
    public CocheAutomatico(String matricula, double limiteVelocidad) {
        super(matricula,limiteVelocidad);
    }

    // SETTER
    public void setMarcha(){

    }
    public void setVelocidad(){

    }

    // METODOS
    public boolean acelerar(double incremento) {
        if (velocidad + incremento <= limiteVelocidad) {
            velocidad += incremento;
            calcularMarcha();
            return true;  // Aceleración exitosa
        } else {
            // Velocidad máxima alcanzada
            System.out.println("Velocidad máxima alcanzada. No se puede acelerar más.");
            return false;
        }
    }

    protected void calcularMarcha() {
        if(velocidad == 0){
            System.out.println("Coche en punto muerto");
        } else if (velocidad > 0 && velocidad < 10) {
            System.out.println("Marcha 1");  
            marcha = 1;
        } else if (velocidad > 10 && velocidad < 25) {
            System.out.println("Marcha 2");  
            marcha = 2;
        } else if (velocidad > 25 && velocidad < 50) {
            System.out.println("Marcha 3");
            marcha = 3;
        } else if (velocidad > 50 && velocidad < 75) {
            System.out.println("Marcha 4");
            marcha = 4;
        } else if (velocidad > 75 && velocidad < 95) {
            System.out.println("Marcha 5");
            marcha = 5;
        } else {
            System.out.println("Marcha 6");
            marcha = 6;
        }
    }
}
