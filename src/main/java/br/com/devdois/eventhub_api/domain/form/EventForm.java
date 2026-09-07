package br.com.devdois.eventhub_api.domain.form;

import java.time.LocalDateTime;

public record EventForm(
        String title,
        String description,
        LocalDateTime date,
        Boolean inPerson,
        String location,
        Integer maxParticipants
) {
}
