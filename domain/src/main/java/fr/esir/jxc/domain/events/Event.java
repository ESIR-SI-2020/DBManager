package fr.esir.jxc.domain.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.databind.node.ObjectNode;

import org.elasticsearch.search.DocValueFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

  private String id;
  private String type;
  private ObjectNode metadata;
  private DocValueFormat.DateTime createdAt;

}

