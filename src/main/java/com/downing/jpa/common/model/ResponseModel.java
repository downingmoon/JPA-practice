package com.downing.jpa.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class ResponseModel implements Serializable {
    private boolean result;
    private int code;
    private String messasge;
    private Map<String, Object> data;

    public ResponseModel() {
        this.result = true;
        this.code = HttpStatus.OK.value();
        this.data = null;
        this.messasge = new String();
    }

    public ResponseModel(boolean result, String message) {
        this.result = result;
        this.code = HttpStatus.OK.value();
        this.messasge = message;
        this.data = null;
    }
}
