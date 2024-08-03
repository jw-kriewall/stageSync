package com.stagesync.stagesyncapp.controller;

import com.stagesync.stagesyncapp.model.Concert;
import com.stagesync.stagesyncapp.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/concerts")
public class ConcertController {
    @Autowired
    private ConcertService concertService;

    @GetMapping
    public List<Concert> getAllConcerts() {
        return concertService.getAllConcerts();
    }

    @GetMapping("/{id}")
    public Optional<Concert> getConcertById(@PathVariable String id) {
        return concertService.getConcertById(id);
    }

    @PostMapping
    public Concert addConcert(@RequestBody Concert concert) {
        return concertService.addConcert(concert);
    }

    @PutMapping("/{id}")
    public Concert updateConcert(@PathVariable String id, @RequestBody Concert concert) {
        return concertService.updateConcert(id, concert);
    }

    @DeleteMapping("/{id}")
    public void deleteConcert(@PathVariable String id) {
        concertService.deleteConcert(id);
    }
}
