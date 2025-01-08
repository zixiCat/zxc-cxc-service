package com.zxc.cxc.openapi.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCode {
  SUCCESS(20000, "Success"),
  BAD_REQUEST(40000, "Bad Request"),
  UNAUTHORIZED(40001, "Unauthorized"),
  FORBIDDEN(40003, "Forbidden"),
  NOT_FOUND(40004, "Not Found"),
  INTERNAL_SERVER_ERROR(50000, "Internal Server Error");

  private final Integer code;
  private final String message;
}
