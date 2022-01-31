package edu.weber.w01113559.repository;

import edu.weber.w01113559.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Anthony");
        speaker.setLastName("Bahl");

        speakers.add(speaker);

        return speakers;
    }

}
