package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;

@Getter
@Setter
@DiscriminatorValue("ladron")
public class Ladron extends Personaje{
  @Column
  private Integer nivelSiniestro;
  @Column
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
 //TODO
  }

  public void setNivelSiniestro(Integer nivelSiniestro) {
    this.nivelSiniestro = nivelSiniestro;
  }

  public void setTieneNavaja(Boolean tieneNavaja) {
    this.tieneNavaja = tieneNavaja;
  }
}
