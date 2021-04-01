package com.textservice.demo.repository;

import com.textservice.demo.model.TextStory;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface TextRepository extends JpaRepository<TextStory, Integer> {
    TextStory findTextById(Integer textId);
}
