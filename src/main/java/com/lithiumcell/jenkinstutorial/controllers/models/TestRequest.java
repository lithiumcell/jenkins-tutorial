package com.lithiumcell.jenkinstutorial.controllers.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TestRequest {
    private final String name;

    private final Integer age;
}
