package com.ses.pizzamanagement.common.errors;

public class ResourceConflictException extends RuntimeException {
  public ResourceConflictException(String message) {
    super(message);
  }
}
