package br.com.devdois.eventhub_api.repository;

import br.com.devdois.eventhub_api.domain.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
