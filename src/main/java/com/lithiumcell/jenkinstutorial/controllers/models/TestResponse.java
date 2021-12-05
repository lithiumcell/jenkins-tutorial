package com.lithiumcell.jenkinstutorial.controllers.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TestResponse {

    private final String representation;
}
