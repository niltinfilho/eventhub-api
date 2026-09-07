package br.com.devdois.eventhub_api.controller;

import br.com.devdois.eventhub_api.domain.form.EventForm;
import br.com.devdois.eventhub_api.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class EventController {

    private EventService service;

    @PostMapping(value = "/event")
    public ResponseEntity<String> cadastrarEvento(@RequestBody EventForm form) {
        return ResponseEntity.ok(service.cadastrar(form));
    }

}
