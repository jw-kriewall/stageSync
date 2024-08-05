package com.stagesync.stagesyncapp.repository;

import com.stagesync.stagesyncapp.model.Venue;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends MongoRepository<Venue, String> {
}
