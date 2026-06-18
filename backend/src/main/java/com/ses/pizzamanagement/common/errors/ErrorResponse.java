package com.ses.pizzamanagement.common.errors;

import java.time.LocalDateTime;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public record ErrorResponse(
        int status,
        String error,
        String message,
        String path,
        LocalDateTime timestamp,
        Map<String, String> fieldErrors) {
}
