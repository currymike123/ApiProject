package apiproject;

import apiproject.webserver.LoginRequest;
import apiproject.webserver.LoginResponse;
import apiproject.webserver.LoginResponseCode;
import apiproject.webserver.LogoutResponse;
import apiproject.webserver.ProfileChangeRequest;
import apiproject.webserver.ProfileChangeResponse;
import apiproject.webserver.ProfileLoadResponse;
import apiproject.webserver.WebServer;

public class PrototypeSomeApi {

    public void prototype(WebServer server) {
        // log in the user: what do we need to build a LoginRequest?
        LoginResponse loginResponse = server.login(new LoginRequest() {}); // Corrected line

        // load their profile
        if (loginResponse.getResponseCode().success()) {
            ProfileLoadResponse profileLoadResponse = server.loadProfile(loginResponse.getUserIdentifier());

        // make a change to the profile: what do we need to create one of these
            ProfileChangeRequest changeRequest = new ProfileChangeRequest() {}; // Corrected line
            ProfileChangeResponse profileChangeResponse = server.changeProfile(loginResponse.getUserIdentifier(), changeRequest);

        // reload the updated version of the profile
            profileLoadResponse = server.loadProfile(loginResponse.getUserIdentifier());

        // log out
            server.logout(loginResponse.getUserIdentifier());
        }
    }
}
