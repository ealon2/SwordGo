package utn.dds.parcialb.domain;

import lombok.Getter;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * (1) La estrategia ideal de mapeo de herencia para los ítems es JOINED, dado que
 * hay tanto consultas polimórficas como no polimórficas,
 * columnas compartidas (ID, ubicacion_id y personaje_duenio_id)
 * y no compartidas (personaje_usuario_id, costo, nombre, etc)
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Items")
public abstract class Item extends PersistenceEntity{
  @Getter protected int costo;
  @Getter protected String nombre;
}
