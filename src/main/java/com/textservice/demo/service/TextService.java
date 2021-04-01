package com.textservice.demo.service;

import lombok.extern.slf4j.Slf4j;
import com.textservice.demo.model.TextStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.textservice.demo.repository.textstory.TextStoryDAO;

import java.util.List;

@Service
@Slf4j
public class TextService {

    @Autowired
    private TextStoryDAO textStoryDAO;

    @Transactional
    public TextStory saveText(TextStory newText) {
        log.info("Inside saveText method of TextService");
        return textStoryDAO.saveText(newText);
    }

    @Transactional
    public TextStory findTextById(Integer textId) {
        log.info("Inside findTextById method of TextService");
        return textStoryDAO.getText(textId);
    }

    @Transactional
    public List<TextStory> getAll() {
        return textStoryDAO.getAllTexts();
    }

    @Transactional
    public void deleteText(Integer id) {
        textStoryDAO.deleteTextStory(id);
    }
}
