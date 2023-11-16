//Catherine AM
package unidad5.ejercicio4;

public class Reloj {
    //ATRIBUTOS
    private int hora,min,seg;
    public enum FormatoHora{
        FORMATO24H,FORMATO12H
    }

    //CONSTRUCTOR SIN PARAMETROS
    public Reloj() {
        this.hora = 0;
        this.min = 0;
        this.seg = 0; 
    }

    //CONSTRUCTOR
    public Reloj(int hora, int minutos, int segundos) {
        this.setHora(hora);
        this.min = minutos;
        this.seg = segundos;
    }

    //GET
    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    //SET
    public void setHora(int hora) {
        if(hora < 0 || hora > 24){
            System.out.println("Valor incorrecto de hora");
        } else{
        this.hora = hora;
        }
    }

    //METODOS
    public void imprimirHora(){
        System.out.println("Hora en formato 24h: " + hora + " : " + min + " : " + seg);
    }
     
    //Imprime la hora en formato 12 o 24 horas
    public void imprimirHora(FormatoHora formato){
        if (formato == FormatoHora.FORMATO24H) {
            imprimirHora();
        } else {
            if (getHora() > 12) {
                System.out.println("Hora en formato 12h: " + (hora-12) + " : " + min + " : " + seg + " PM");
            } else {
                System.out.println("Hora en formato 12h: " + (hora) + " : " + min + " : " + seg + " AM");
            }
        }
    }
   
    //Establece el reloj en hora
    public void ponerEnHora(int nuevaHora, int nuevosMinutos) {
        this.hora = nuevaHora;
        this.min = nuevosMinutos;
        this.seg = 0;
        System.out.println("Cambio de hora a " + hora + " : " + min + " sin tener en cuenta los segundos");
    }

    //Establece el reloj en hora con segundos
    public void ponerEnHora(int nuevaHora, int nuevosMinutos, int nuevosSegundos) {
        this.hora = nuevaHora;
        this.min = nuevosMinutos;
        this.seg = nuevosSegundos;
        System.out.println("Cambio de hora a " + hora+ " : " + min + " : " + seg + " con segundos");
    }

    //Poner la hora especificando si es AM o es PM
    public void ponerEnHoraPeriodo(int nuevaHora, int minutos, String periodo) {
        if (periodo.equalsIgnoreCase("AM") || periodo.equalsIgnoreCase("PM")) {
            if (periodo.equalsIgnoreCase("PM") && hora < 12) {
                hora += 12;
            } else if (periodo.equalsIgnoreCase("AM") && hora == 12) {
                hora = 0;
            }
            System.out.println("Cambio de hora en formato 12H: " + hora + " : " + min + " : " + seg + " " + periodo);
        } else {
            System.out.println("Formato de periodo incorrecto. Usa AM o PM.");
        }
    }

}
