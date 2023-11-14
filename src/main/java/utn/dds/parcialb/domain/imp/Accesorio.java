package utn.dds.parcialb.domain.imp;

import utn.dds.parcialb.domain.Item;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "Accesorios")
public class Accesorio extends Item {

  @Override
  public int getCosto() {
    return 0;
  }

  @Override
  public String getNombre() {
    return null;
  }
}
