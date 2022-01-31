package edu.weber.w01113559.service;

import edu.weber.w01113559.model.Speaker;
import edu.weber.w01113559.repository.HibernateSpeakerRepositoryImpl;
import edu.weber.w01113559.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
