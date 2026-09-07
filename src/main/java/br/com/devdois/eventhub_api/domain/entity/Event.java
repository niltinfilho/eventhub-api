package br.com.devdois.eventhub_api.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "event")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "in_person")
    private Boolean inPerson;

    @Column(name = "location")
    private String location;

    @Column(name = "max_participants")
    private Integer maxParticipants;

    public Boolean isPresencial() {
        return this.inPerson;
    }

}
