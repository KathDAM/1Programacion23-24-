package segundaev.ejemplos.ejemplo1;

public class Main {
    public static void main(String[] args) {
        //Horario horario1 = new Horario();
        Alumno alumno1 = new Alumno();

        alumno1.nombre = "Kath";
        alumno1.apellidos = "Alventosa";
        alumno1.añoDeNacimiento = 1998;

        alumno1.ponGrupo("1ºDAM",new Horario());
        

        alumno1.imprime(); 
    }
}
