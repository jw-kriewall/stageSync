package com.stagesync.stagesyncapp.repository;

import com.stagesync.stagesyncapp.model.Concert;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConcertRepository extends MongoRepository<Concert, String> {
}
