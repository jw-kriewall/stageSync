package com.stagesync.stagesyncapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "musicians")
public class Musician {
    @Id
    private String id;
    private String name;
    private String instrument;
    private List<String> concertsOffered;
    private List<String> concertsDeclined;
    private List<String> concertsAccepted;
    private List<String> concertsUnavailable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public List<String> getConcertsOffered() {
        return concertsOffered;
    }

    public void setConcertsOffered(List<String> concertsOffered) {
        this.concertsOffered = concertsOffered;
    }

    public List<String> getConcertsDeclined() {
        return concertsDeclined;
    }

    public void setConcertsDeclined(List<String> concertsDeclined) {
        this.concertsDeclined = concertsDeclined;
    }

    public List<String> getConcertsAccepted() {
        return concertsAccepted;
    }

    public void setConcertsAccepted(List<String> concertsAccepted) {
        this.concertsAccepted = concertsAccepted;
    }

    public List<String> getConcertsUnavailable() {
        return concertsUnavailable;
    }

    public void setConcertsUnavailable(List<String> concertsUnavailable) {
        this.concertsUnavailable = concertsUnavailable;
    }
}
