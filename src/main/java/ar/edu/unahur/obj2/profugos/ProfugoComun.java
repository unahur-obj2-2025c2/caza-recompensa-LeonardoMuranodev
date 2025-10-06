package ar.edu.unahur.obj2.profugos;

public class ProfugoComun implements IProfugo{
    private Boolean nervioso;
    private Integer inocencia;
    private Integer habilidad;

    public ProfugoComun(Boolean nervioso, Integer inocencia, Integer habilidad) {
        this.nervioso = nervioso;
        this.inocencia = inocencia;
        this.habilidad = habilidad;
    }

    @Override
    public Integer getInocencia() {
        return inocencia;
    }

    @Override
    public Integer getHabilidad() {
        return habilidad;
    }

    @Override
    public Boolean esNervioso() {
        return nervioso;
    }

    @Override
    public void volverseNervioso() {
        nervioso = true;
    }

    @Override
    public void dejarDeEstarNervioso() {
        nervioso = false;
    }

    @Override
    public void reducirHabilidad() {
        habilidad = Math.max(0,habilidad - 5);
    }

    @Override
    public void disminuirInocencia() {
        inocencia = Math.max(0, inocencia - 2);
    }

}
