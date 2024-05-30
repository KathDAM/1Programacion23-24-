package RepasoEx3ev.Fichero;

public class Main {
    public static void main(String[] args) {
        AgendaClientes agenda = new AgendaClientes();
        agenda.cargarClientes("clientes.txt");

        // Ejemplo de uso
        Cliente nuevoCliente = new Cliente("001", "Juan", "Perez", "Gomez", "123456789", "Calle Falsa 123", "01/01/2000");
        agenda.agregarCliente(nuevoCliente);

        agenda.eliminarClientePorCodigo("002");

        Cliente clienteEncontrado = agenda.buscarClientePorNombre("Maria");
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado: " + clienteEncontrado);
        } else {
            System.out.println("Cliente no encontrado.");
        }

        // Guardar los cambios al finalizar
        agenda.guardarClientes("clientes.txt");
    }
}
