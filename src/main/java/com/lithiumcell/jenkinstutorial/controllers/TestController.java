package com.lithiumcell.jenkinstutorial.controllers;

import com.lithiumcell.jenkinstutorial.controllers.models.TestRequest;
import com.lithiumcell.jenkinstutorial.controllers.models.TestResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {

    @PostMapping("/test")
    public TestResponse getRepresentation(@RequestBody final TestRequest testRequest) {
        final String representation = testRequest.getName() + " " + testRequest.getAge();
        return TestResponse.builder()
                           .representation(representation)
                           .build();
    }
}
