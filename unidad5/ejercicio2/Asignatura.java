package unidad5.ejercicio2;

public class Asignatura {
    //ATRIBUTOS
    private String nombre;
    private int codigo;
    private int curso;

    //CONSTRUCTOR
    public Asignatura(String nombre, int codigo, int curso) {
        setNombre(nombre);
        setCodigo(codigo);
        setCurso(curso); 
    }

    //GETTER    
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCurso() {
        return curso;
    }

    //SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    //METODOS
    public void imprimeAsignatura(){
        System.out.print("Nombre '" + nombre + "'");
        System.out.print(", código " + codigo);
        System.out.print(", curso " + curso);
        System.out.println();
    }
    
}
