package fr.esir.jxc.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {

    private Date date;
    private String code;
    private String message;
    private String reason;
    private String path;

}
