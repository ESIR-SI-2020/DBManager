package fr.esir.jxc.domain.events;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

  private String id;
  private String type;
  private ObjectNode metadata;
  private LocalDateTime createdAt;
  
  public static Optional<Event> of(Object event) {
        try {
            return Optional.of(new Event(UUID.randomUUID().toString(), event.getClass().getSimpleName(), Json.MAPPER.writeValueAsString(event), new Date()));
        } catch (JsonProcessingException e) {
            // TODO handle the error precisely, maybe retry
            e.printStackTrace();
            return Optional.empty();
        }
    }
}

