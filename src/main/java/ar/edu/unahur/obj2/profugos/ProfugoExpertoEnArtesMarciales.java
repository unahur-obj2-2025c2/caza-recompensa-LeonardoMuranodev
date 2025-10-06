package ar.edu.unahur.obj2.profugos;

public class ProfugoExpertoEnArtesMarciales implements IProfugo{
    private IProfugo profugoDecorado;

    public ProfugoExpertoEnArtesMarciales(IProfugo profugoDecorado) {
        this.profugoDecorado = profugoDecorado;
    }

    @Override
    public Integer getInocencia() {
        return profugoDecorado.getInocencia();
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(profugoDecorado.getHabilidad() * 2, 100);
    }

    @Override
    public Boolean esNervioso() {
        return profugoDecorado.esNervioso();
    }

    @Override
    public void volverseNervioso() {
        profugoDecorado.volverseNervioso();
    };

    @Override
    public void dejarDeEstarNervioso() {
        profugoDecorado.dejarDeEstarNervioso();
    };

    @Override
    public void reducirHabilidad() {
        profugoDecorado.reducirHabilidad();
    }

    @Override
    public void disminuirInocencia() {
        profugoDecorado.disminuirInocencia();
    }
    
}
