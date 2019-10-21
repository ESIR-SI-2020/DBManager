package com.jxc.dbmanager.models;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@Document(indexName = "useradded")
public class UserAdded {

    private Date creationDate;

}