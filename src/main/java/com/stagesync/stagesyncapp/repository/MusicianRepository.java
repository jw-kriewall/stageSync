package com.stagesync.stagesyncapp.repository;

import com.stagesync.stagesyncapp.model.Musician;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicianRepository extends MongoRepository<Musician, String> {
}
