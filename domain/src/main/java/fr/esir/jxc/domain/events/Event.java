package fr.esir.jxc.domain.events;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import fr.esir.jxc.domain.utils.Json;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

  private String id;
  private String type;
  private ObjectNode metadata;
  private LocalDateTime createdAt;
  
  public static Optional<Event> of(Object event) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        return Optional.of(new Event(UUID.randomUUID().toString(), event.getClass().getSimpleName(), Json.MAPPER.createObjectNode().putPOJO("event", event), LocalDateTime.now()));
    }
}
