package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.Converters.ElementoDefensorConverter;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "personajes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="tipo")
public class Personaje {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Getter
  @ElementCollection
  @CollectionTable(name = "ElementoDefensor")
  @Convert(converter = ElementoDefensorConverter.class)
  @Column(name = "elemento_defensor")
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name = "estamina")
  private Integer estamina;

  @Getter @Setter
  @Column(name = "puntos_de_vida")
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

  public void setEstamina(Integer estamina) {
    this.estamina = estamina;
  }

  public void setPuntosDeVida(Integer puntosDeVida) {
    this.puntosDeVida = puntosDeVida;
  }
}
