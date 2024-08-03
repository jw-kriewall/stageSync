package com.stagesync.stagesyncapp.repository;

import com.stagesync.stagesyncapp.model.Sponsor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SponsorRepository extends MongoRepository<Sponsor, String> {
}