package com.stagesync.stagesyncapp.repository;

import com.stagesync.stagesyncapp.model.Sponsor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository extends MongoRepository<Sponsor, String> {
}