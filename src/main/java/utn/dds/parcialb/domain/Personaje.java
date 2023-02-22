package utn.dds.parcialb.domain;

import utn.dds.parcialb.domain.imp.Accesorio;
import utn.dds.parcialb.domain.imp.Arma;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Personajes")
public class Personaje extends PersistenceEntity{
  String nombre;
  int monedas;

  @Enumerated(EnumType.STRING)
  TipoDePersonaje tipoDePersonaje;

  @ManyToMany
  @OrderColumn(name="ubicacion_visitada")
  List<Ubicacion> ubicaciones;

  @OneToMany
  @JoinColumn(name = "personaje_duenio_id")
  List<Item> items;

  @OneToMany
  @JoinColumn(name = "personaje_id")
  List<Accesorio> accesorios;

  @OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
  @JoinColumn(name = "personaje_id")
  List<Arma> armas;

}
