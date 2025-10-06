package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.edu.unahur.obj2.cazadores.Cazador;
import ar.edu.unahur.obj2.profugos.IProfugo;

public class JefeDeAgencia {
    private static JefeDeAgencia instancia = new JefeDeAgencia();
    private List<Cazador> cazadores = new ArrayList<Cazador>();

    private JefeDeAgencia() {}

    public static JefeDeAgencia getInstancia() {
        return instancia;
    }

    //Metodos que pide el EJ

    public List<IProfugo> profugosCapturados() {
        return cazadores.stream().flatMap(c -> c.getCapturados().stream()).toList();
    }

    public IProfugo profujoMasHabilCapturado() {
        return this.profugosCapturados().stream().max(Comparator.comparing(p -> p.getHabilidad())).orElseThrow(() -> new RuntimeException("No hay profugos cazados por la agencia"));
    }

    public Cazador cazadorConMasCapturas() {
        return cazadores.stream().max(Comparator.comparing(c -> c.cantProfugosCapturados())).orElseThrow(() -> new RuntimeException("No hay cazadores en la agencia"));
    }

    public List<Cazador> getCazadores() {
        return cazadores;
    }

    public void agregarCazador(Cazador cazador) {
        cazadores.add(cazador);
    }
}