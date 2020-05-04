package de.macevil.sayhello;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "smokeTest")
public class SmokeTestEndpoint {

    @ReadOperation(produces = {"application/json"})
    public String smokeTest() {
        return "{\"status\": \"UP\"}";
    }

}