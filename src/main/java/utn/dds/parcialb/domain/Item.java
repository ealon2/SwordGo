package utn.dds.parcialb.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * La estrategia ideal de mapeo de herencia para los ítems es JOINED, dado que
 * hay tanto consultas polimórficas como no polimórficas,
 * columnas compartidas (ID, ubicacion_id y personaje_duenio_id)
 * y no compartidas (personaje_usuario_id, costo, nombre, etc)
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Item extends PersistenceEntity{
  private int costo;
  private String nombre;

  public abstract int getCosto();
  public abstract String getNombre();
}
