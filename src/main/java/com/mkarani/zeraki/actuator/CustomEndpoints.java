package com.mkarani.zeraki.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id="releaseNotes")
public class  CustomEndpoints {
    @ReadOperation
    public Map<String, Object> customEndpoint() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Custom endpoint is accessed");
        return result;
    }

    @ReadOperation
    public String customEndpointWithParameter(@Selector String name) {
        return "Hello, " + name + "!";
    }

}
