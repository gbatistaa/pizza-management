package com.ses.pizzamanagement.common.errors;

public class UnprocessableContentException extends RuntimeException {
  public UnprocessableContentException(String message) {
    super(message);
  }
}
