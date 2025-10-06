package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class Zona {
    private String nombre;
    private List<IProfugo> profugos = new ArrayList<IProfugo>();
    
    public Zona(String nombre, List<IProfugo> profugos) {
        this.nombre = nombre;
        this.profugos = profugos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<IProfugo> getProfugos() {
        return profugos;
    }

    public void quitarProfugo(IProfugo profugo) {
        profugos.remove(profugo);
    }
}
