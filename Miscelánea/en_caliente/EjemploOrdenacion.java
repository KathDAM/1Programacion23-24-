/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en_caliente;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author jsanm
 */
public class EjemploOrdenacion {
   
    
    private final static Scanner SCN = new Scanner(System.in);
    
    
    public static void main(String[] args){
        
        System.out.println("*** Ordenación de clientes. Introducción de los dos clientes ***");
        Cliente[] clientes = {inicializarCliente(), inicializarCliente()};
        
        Comparator cmpNombreCliente = new Comparator() {
            @Override
            public int compare(Object cli1, Object cli2) {
                if(cli1 instanceof Cliente && cli2 instanceof Cliente){
                    Cliente cliente1 = (Cliente)cli1;
                    Cliente cliente2 = (Cliente)cli2;
                    return cliente1.getNombreCompleto().compareTo(cliente2.getNombreCompleto());
                }
                return 0;
            }
        };
        
        Cliente[] clientesOrdenadosPorNombre = clientes.clone();
        Arrays.sort(clientesOrdenadosPorNombre, cmpNombreCliente);
        
        System.out.println("Los clientes ordenados por nombre son: " + Arrays.toString(clientesOrdenadosPorNombre));
        
        //TODO
        //implementar aquí la ordenación del array "clientes" por fecha de nacimiento
        Comparator cmpFechaCliente = new Comparator() {
            @Override
            public int compare(Object cli1, Object cli2) {
                if(cli1 instanceof Cliente && cli2 instanceof Cliente){
                    Cliente cliente1 = (Cliente)cli1;
                    Cliente cliente2 = (Cliente)cli2;
                    return cliente1.getFechaNacimiento().compareTo(cliente2.getFechaNacimiento());
                }
                return 0;
            }
        };
        
        Cliente[] clientesOrdenadosPorFecha = clientes.clone();
        Arrays.sort(clientesOrdenadosPorFecha, cmpFechaCliente);
        
        System.out.println("Los clientes ordenados por fecha son: " + Arrays.toString(clientesOrdenadosPorFecha));
        
        
    }
    
    private static Cliente inicializarCliente(){
        
        System.out.print("Indique el nombre del cliente: ");
        String nombreCliente = SCN.nextLine();
        
        System.out.print("Indique la fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacClienteStr = SCN.nextLine();
        
        Cliente cl = new Cliente(nombreCliente, fechaNacClienteStr);
        
        return cl;
    }
    
    
}
