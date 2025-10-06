package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorUrbano extends Cazador{

    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    @Override
    public Boolean condicionExtra(IProfugo profugo) {
        return !profugo.esNervioso();
    }

    @Override
    public void intimidacionExtra(IProfugo profugo) {
        profugo.dejarDeEstarNervioso();
    }
}