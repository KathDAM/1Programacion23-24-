package terceraev.avanzadoscolecciones.ej5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Maraton {
    public static void main(String[] args) {
        Maraton maraton = new Maraton(50);

        maraton.registrarParticipante(new Participante("Juan", "Lucas", Genero.MASCULINO));
        maraton.registrarParticipante(new Participante("Mara", "Ruiz", Genero.FEMENINO));
        maraton.registrarParticipante(new Participante("Andres", "Benlloch", Genero.MASCULINO));

        maraton.imprimirParticipantes();

        maraton.devolverDorsal(2);
        maraton.devolverDorsal(4);

        maraton.imprimirParticipantes();
    }
    
    private int capacidadMaxima;
    private List<Participante> participantes;
    private List<Integer> dorsalesDispo;

    // CONSTRUCTOR
    public Maraton(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.participantes = new ArrayList<>();
        this.dorsalesDispo = new ArrayList<>();
        for (int i = 1; i <= capacidadMaxima; i++) {
            dorsalesDispo.add(i);
        }
    }

    // METODOS
    public void registrarParticipante(Participante participante) {
        if (participantes.size() < capacidadMaxima) {
            if (!dorsalesDispo.isEmpty()) {
                Random random = new Random();
                int index = random.nextInt(dorsalesDispo.size());
                int dorsal = dorsalesDispo.remove(index);
                participante.setDorsal(dorsal);
                participantes.add(participante);
                System.out.println("Participante registrado: " + participante);
            } else {
                System.out.println("No hay dorsales disponibles.");
            }
        } else {
            System.out.println("La maratón ha alcanzado su capacidad máxima.");
        }
    }

    public void devolverDorsal(int dorsal) {
        for (int i = 0; i < participantes.size(); i++) {
            Participante participante = participantes.get(i);
            if (participante.getDorsal() == dorsal) {
                participantes.remove(i);
                dorsalesDispo.add(dorsal);
                System.out.println("Dorsal devuelto: " + dorsal);
                return;
            }
        }
        System.out.println("No se encontró ningún participante con el dorsal " + dorsal);
    }

    public void imprimirParticipantes() {
        System.out.println("Lista de participantes:");
        for (int i = 0; i < participantes.size(); i++) {
            Participante participante = participantes.get(i);
            System.out.println(participante);
        }
    }

    
}
