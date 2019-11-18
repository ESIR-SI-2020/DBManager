package fr.esir.jxc.domain.models.analytics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "pocket", type = "user_added")
public class UserAdded {

    @Id
    private String id;
    private Date creationDate;

}
