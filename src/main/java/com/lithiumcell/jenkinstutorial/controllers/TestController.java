package com.lithiumcell.jenkinstutorial.controllers;

import com.lithiumcell.jenkinstutorial.controllers.models.TestRequest;
import com.lithiumcell.jenkinstutorial.controllers.models.TestResponse;
import com.lithiumcell.jenkinstutorial.repositories.Details;
import com.lithiumcell.jenkinstutorial.repositories.DetailsRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {

    @Autowired
    private DetailsRepository detailsRepository;

    @PostMapping("/test")
    public TestResponse getRepresentation(@RequestBody final TestRequest testRequest) {
        final String representation = testRequest.getName() + " " + testRequest.getAge();

        final Details details = new Details(testRequest.getName(), testRequest.getAge());
        detailsRepository.insert(details);
        return TestResponse.builder()
                           .representation(representation)
                           .build();
    }
}
