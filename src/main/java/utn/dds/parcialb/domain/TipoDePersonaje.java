package utn.dds.parcialb.domain;

/**
 * Dado que Tipo de Personaje es una clase Stateless, puedo convertirlo en
 * un ENUM con comportamiento. Y emplear, un ENUMERATED como mapeo.
 */
public enum TipoDePersonaje{
  Guerrero{
    @Override
    public void comerciar(Item item, Personaje personaje) {

    }

    @Override
    public void pelear(Personaje personaje) {

    }

    @Override
    public void buscarItem(Ubicacion ubicacion) {

    }
  },
  Comerciante{
    @Override
    public void comerciar(Item item, Personaje personaje) {

    }

    @Override
    public void pelear(Personaje personaje) {

    }

    @Override
    public void buscarItem(Ubicacion ubicacion) {

    }
  },
  Hechicero{
    @Override
    public void comerciar(Item item, Personaje personaje) {

    }

    @Override
    public void pelear(Personaje personaje) {

    }

    @Override
    public void buscarItem(Ubicacion ubicacion) {

    }
  };

  public abstract void comerciar(Item item, Personaje personaje);
  public abstract void pelear(Personaje personaje);
  public abstract void buscarItem(Ubicacion ubicacion);
}
