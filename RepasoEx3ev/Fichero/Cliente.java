package RepasoEx3ev.Fichero;

public class Cliente {
    private String codigoCliente;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String direccion;
    private String fechaNacimiento;

    // Constructor
    public Cliente(String codigoCliente, String nombre, String primerApellido, String segundoApellido, String telefono, String direccion, String fechaNacimiento) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y setters
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    // Otros getters y setters para las demás propiedades

    // Método toString para imprimir los datos del cliente
    @Override
    public String toString() {
        return "Cliente{" +
                "codigoCliente='" + codigoCliente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
