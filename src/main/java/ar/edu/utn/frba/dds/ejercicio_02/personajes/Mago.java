package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@DiscriminatorValue("mago")
public class Mago  extends Personaje{
  @Column
  private Boolean tieneAlas;
  @Column
  private Integer nivelDeMagia;

  public void atacar(Personaje personaje) {
 //TODO
  }


  public void setNivelDeMagia(int i) {
    this.nivelDeMagia = i;
  }

  public void setTieneAlas(Boolean tieneAlas) {
    this.tieneAlas = tieneAlas;
  }
}
