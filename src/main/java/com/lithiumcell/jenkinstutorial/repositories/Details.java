package com.lithiumcell.jenkinstutorial.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Details {

    @Id
    private String id;

    private String name;

    private Integer age;

    public Details(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
