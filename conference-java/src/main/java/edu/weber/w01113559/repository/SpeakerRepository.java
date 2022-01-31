package edu.weber.w01113559.repository;

import edu.weber.w01113559.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
