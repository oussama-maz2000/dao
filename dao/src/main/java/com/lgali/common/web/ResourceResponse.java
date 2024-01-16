package com.lgali.common.web;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResourceResponse <T>{
    private String status;
    private String errorMessage;
    private T body;
    private Map<String, String> errors;
}
