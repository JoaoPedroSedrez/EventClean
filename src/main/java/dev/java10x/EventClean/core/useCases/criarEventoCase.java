package dev.java10x.EventClean.core.useCases;

import dev.java10x.EventClean.core.Enums.TipoEvento;
import dev.java10x.EventClean.core.entities.Event;

public interface criarEventoCase {

    public Event execute(Event evento);

}
