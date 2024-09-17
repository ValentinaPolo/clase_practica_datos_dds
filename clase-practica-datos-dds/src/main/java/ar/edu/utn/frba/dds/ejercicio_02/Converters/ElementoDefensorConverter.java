package ar.edu.utn.frba.dds.ejercicio_02.Converters;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Escudo;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ElementoDefensorConverter implements AttributeConverter<ElementoDefensor, String>
{

    @Override
    public String convertToDatabaseColumn(ElementoDefensor tipo) {
        if (tipo instanceof Escudo) {
            return "escudo";
        } else if (tipo instanceof Espada) {
            return "espada";
        }
        else if (tipo instanceof Arco){
            return"arco";

        }
        return null;
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String dbData) {
        if ("espada".equals(dbData)) {
            return new Espada();
        } else if ("escudo".equals(dbData)) {
            return new Escudo();
        }
        else if ("arco".equals(dbData)){
            return new Arco();
        }
        return null;
    }
}