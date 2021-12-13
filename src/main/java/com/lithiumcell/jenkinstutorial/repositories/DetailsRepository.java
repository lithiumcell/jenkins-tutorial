package com.lithiumcell.jenkinstutorial.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DetailsRepository extends MongoRepository<Details, String> {
}
