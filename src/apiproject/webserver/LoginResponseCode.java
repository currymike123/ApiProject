package apiproject.webserver;

public enum LoginResponseCode {

  SUCCESS(true),
  FAILURE(false),
  UNKNOWN_USERNAME(false);

  private boolean success;

  private LoginResponseCode(boolean success) {
    this.success = success;
  }

  public boolean success() {
    return success;
  }

}
