package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorRural extends Cazador{

    public CazadorRural(Integer experiencia) {
        super(experiencia);
    }

    @Override
    public Boolean condicionExtra(IProfugo profugo) {
        return profugo.esNervioso();
    }

    @Override
    public void intimidacionExtra(IProfugo profugo) {
        profugo.volverseNervioso();
    }

}
