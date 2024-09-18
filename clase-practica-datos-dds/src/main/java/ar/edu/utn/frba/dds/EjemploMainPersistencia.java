package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.ejercicio_02.Jugador;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;
import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;

import java.time.LocalDate;

public class EjemploMainPersistencia {
    
    public static void main(String[] args) {

        PruebaPersistencia prueba = new PruebaPersistencia();
        prueba.setNombre("ejemplo");

        Repositorio repositorio = new Repositorio();

        Jugador jugador = new Jugador();
        Personaje personaje = new Personaje();
        Arco arco = new Arco();
        Espada espada = new Espada();


        personaje.setEstamina(2);
        personaje.setPuntosDeVida(5);
        personaje.agregarElemento(arco);
        personaje.agregarElemento(espada);
        repositorio.guardar(personaje);

        jugador.setNombre("Luis");
        jugador.setApellido("SQL");
        jugador.setFechaAlta(LocalDate.now());
        jugador.setPersonaje(personaje);


        repositorio.guardar(jugador);
        repositorio.guardar(prueba);
    }
}
