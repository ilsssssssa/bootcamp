public enum SysCode {

  // 1 - 1000 (reserved for error)
  SERVER_TIMEOUT(1, "Server Connection Time out."),

  // 1001 - 2000 (reseved for warning)
  DB_TIMEOUT(1001, "Database Connection timeout"),

  // 2001 - 3000 (Others)
  EMAIL_TOO_LONG(2001, "Email too long"),;


  private int code;

  private String message;

  private SysCode(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public int getCode() {
    return this.code;
  }
}
