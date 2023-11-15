package unidad5.ejercicio4;

public class Reloj {
    //ATRIBUTOS
    private int hora,min,seg;

    //CONSTRUCTOR SIN PARAMETROS
    public Reloj() {
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
        
    }

    //CONSTRUCTOR
    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.min = minutos;
        this.seg = segundos;
    }

        // Método para obtener la hora, minutos y segundos en formato HH:mm:ss
        public String obtenerHoraCompleta() {
            return String.format("%02d:%02d:%02d", hora, min, seg);
        }
    
        // Método para obtener la hora en formato 12 o 24 horas
        public String obtenerHoraFormato12() {
            if (hora >= 0 && hora <= 11) {
                return String.format("%02d:%02d:%02d AM", hora, min, seg);
            } else {
                return String.format("%02d:%02d:%02d PM", (hora == 12 ? 12 : hora - 12), min, seg);
            }
        }
    
        // Método para poner el reloj en hora
        public void ponerEnHora(int nuevaHora, int nuevosMinutos) {
            this.hora = nuevaHora;
            this.min = nuevosMinutos;
            this.seg = 0;
        }
    
        // Método para poner el reloj en hora con segundos
        public void ponerEnHora(int nuevaHora, int nuevosMinutos, int nuevosSegundos) {
            this.hora = nuevaHora;
            this.min = nuevosMinutos;
            this.seg = nuevosSegundos;
        }
    
        // Método para poner la hora especificando AM o PM
        public void ponerEnHora(int nuevaHora, int nuevosMinutos, int nuevosSegundos, String periodo) {
            if (periodo.equalsIgnoreCase("AM") || periodo.equalsIgnoreCase("PM")) {
                this.hora = nuevaHora;
                this.min = nuevosMinutos;
                this.seg = nuevosSegundos;
                if (periodo.equalsIgnoreCase("PM") && this.hora < 12) {
                    this.hora += 12;
                }
            } else {
                System.out.println("Formato de periodo incorrecto. Debe ser AM o PM.");
            }
        }
    


}
