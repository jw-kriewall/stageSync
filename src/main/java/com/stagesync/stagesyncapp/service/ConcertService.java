package com.stagesync.stagesyncapp.service;

import com.stagesync.stagesyncapp.model.Concert;
import com.stagesync.stagesyncapp.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConcertService {
    @Autowired
    private ConcertRepository concertRepository;

    public List<Concert> getAllConcerts() {
        return concertRepository.findAll();
    }

    public Optional<Concert> getConcertById(String id) {
        return concertRepository.findById(id);
    }

    public Concert addConcert(Concert concert) {
        return concertRepository.save(concert);
    }

    public Concert updateConcert(String id, Concert concert) {
        if (concertRepository.existsById(id)) {
            concert.setId(id);
            return concertRepository.save(concert);
        } else {
            throw new RuntimeException("Concert not found");
        }
    }

    public void deleteConcert(String id) {
        concertRepository.deleteById(id);
    }
}
