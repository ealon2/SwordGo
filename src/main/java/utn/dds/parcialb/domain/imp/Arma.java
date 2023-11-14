package utn.dds.parcialb.domain.imp;

import utn.dds.parcialb.domain.Item;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Armas")
public class Arma extends Item {
  private int defensa;
  private int ataque;

  @Override
  public int getCosto() {
    return 0;
  }

  @Override
  public String getNombre() {
    return null;
  }
}
