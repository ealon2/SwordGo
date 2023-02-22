package utn.dds.parcialb.domain;

import lombok.Data;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Ubicacion extends PersistenceEntity{
  String nombre;
  @Embedded
  Coordenada coordenada;
  @OneToMany
  @JoinColumn(name = "ubicacion_id")
  List<Item> items;
}
