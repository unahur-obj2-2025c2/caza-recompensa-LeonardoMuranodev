package ar.edu.unahur.obj2.profugos;

public class ProfugoConEntrenamientoDeElite implements IProfugo {
    private IProfugo profugoDecorado;

    public ProfugoConEntrenamientoDeElite(IProfugo profugoDecorado) {
        this.profugoDecorado = profugoDecorado;
    }

    @Override
    public Integer getInocencia() {
        return profugoDecorado.getInocencia();
    }

    @Override
    public Integer getHabilidad() {
        return profugoDecorado.getHabilidad();
    }

    @Override
    public Boolean esNervioso() {
        return false;
    }

    @Override
    public void volverseNervioso() {};

    @Override
    public void dejarDeEstarNervioso() {};

    @Override
    public void reducirHabilidad() {
        profugoDecorado.reducirHabilidad();
    }

    @Override
    public void disminuirInocencia() {
        profugoDecorado.disminuirInocencia();
    }
    
}
