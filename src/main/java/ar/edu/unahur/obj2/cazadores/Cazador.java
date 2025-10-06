package ar.edu.unahur.obj2.cazadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Zona;
import ar.edu.unahur.obj2.profugos.IProfugo;

public abstract class Cazador {
    //Atributos
    private Integer experiencia;
    private List<IProfugo> capturados = new ArrayList<IProfugo>();
    private List<IProfugo> intimidados = new ArrayList<IProfugo>();

    //Constructor
    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    //De consulta
    public Boolean cumpleCondicionesDeCaptura(IProfugo profugo) {
        return this.experiencia > profugo.getInocencia() && this.condicionExtra(profugo);
    }

    public List<IProfugo> getCapturados() {
        return capturados;
    }

    public abstract Boolean condicionExtra(IProfugo profugo);

    public Integer minimoEntreTodosLosIntimidados() {
        return intimidados.stream().mapToInt(p -> p.getHabilidad()).min().orElse(0);
    }

    public Integer cantProfugosCapturados() {
        return capturados.size();
    }

    //De accion
    public void realizarCapturaEnZona(Zona zona) {
        zona.getProfugos().stream().forEach(p -> this.realizarCaptura(p, zona));
    }

    public void realizarCaptura(IProfugo profugo, Zona zona) {
        if (this.cumpleCondicionesDeCaptura(profugo)) {
            this.capturar(profugo, zona);
            this.aumentarExperiencia();
        } else {
            this.intimidar(profugo);
        }
    }

    public void capturar(IProfugo profugo, Zona zona) {
        zona.quitarProfugo(profugo);
        this.capturarProfugo(profugo);
    }

    public void capturarProfugo(IProfugo profugo) {
        this.capturados.add(profugo);
    }

    public void aumentarExperiencia() {
        experiencia += (this.minimoEntreTodosLosIntimidados()) + (2 * this.cantProfugosCapturados());
    }

    public void intimidar(IProfugo profugo) {
        profugo.disminuirInocencia();
        this.intimidacionExtra(profugo);
    }

    public abstract void intimidacionExtra(IProfugo profugo);
}