package br.com.devdois.eventhub_api.service;

import br.com.devdois.eventhub_api.domain.entity.Event;
import br.com.devdois.eventhub_api.domain.form.EventForm;
import br.com.devdois.eventhub_api.repository.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventService {

    private EventRepository repository;

    public String cadastrar(EventForm form) {

        Event event = new Event();
        event.setTitle(form.title());
        event.setDescription(form.description());
        event.setDate(form.date());
        event.setInPerson(form.inPerson());
        if (form.inPerson()) {
            event.setLocation(form.location());
            event.setMaxParticipants(form.maxParticipants());
        }

        repository.save(event);

        return "Evento cadastrado com sucesso!";
    }

}
