package ar.edu.unahur.obj2.profugos;

public class ProfugoConProteccionLegal implements IProfugo{
    private IProfugo profugoDecorado;

    

    public ProfugoConProteccionLegal(IProfugo profugoDecorado) {
        this.profugoDecorado = profugoDecorado;
    }

    @Override
    public Integer getHabilidad() {
        return profugoDecorado.getInocencia();
    }

    @Override
    public Integer getInocencia() {
        return Math.max(profugoDecorado.getHabilidad(), 40);
    }

    @Override
    public Boolean esNervioso() {
        return profugoDecorado.esNervioso();
    }

    @Override
    public void volverseNervioso() {
        profugoDecorado.volverseNervioso();
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugoDecorado.dejarDeEstarNervioso();
    }

    @Override
    public void reducirHabilidad() {
        profugoDecorado.reducirHabilidad();
    }

    @Override
    public void disminuirInocencia() {
        profugoDecorado.disminuirInocencia();
    }

}
