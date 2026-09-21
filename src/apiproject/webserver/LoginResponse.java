package apiproject.webserver;

public interface LoginResponse {
    LoginResponseCode getResponseCode();
    UserIdentifier getUserIdentifier();
}