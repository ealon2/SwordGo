package utn.dds.parcialb.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class PersistenceEntity {
  @Id
  @GeneratedValue
  protected long id;
}
