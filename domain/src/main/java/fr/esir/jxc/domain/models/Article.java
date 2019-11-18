package fr.esir.jxc.domain.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Article {

    @NonNull private String id;
    @NonNull private String url;
    private String owner;
    private String sharedBy;
    private List<String> tags;
    private List<String> suggestedTags;

}
