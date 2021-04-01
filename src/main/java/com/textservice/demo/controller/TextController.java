package com.textservice.demo.controller;

import lombok.extern.slf4j.Slf4j;
import com.textservice.demo.model.TextStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.textservice.demo.service.TextService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/texts")
public class TextController {

    @Autowired
    private TextService textService;

    @PostMapping("/")
    public TextStory saveText(@RequestBody TextStory newText) {
        log.info("Inside saveText method of TextController");
        textService.saveText(newText);
        return newText;
    }

    @GetMapping("/{id}")
    public TextStory findTextById(@PathVariable("id") Integer textId) {
        log.info("Inside saveText method of TextController");
        return textService.findTextById(textId);
    }

    @GetMapping("/")
    public List<TextStory> getAllStories() {
        return textService.getAll();
    }

    @PutMapping("/")
    public TextStory updateTextStory(@RequestBody TextStory textStory) {
        TextStory result = textService.saveText(textStory);
        return result;
    }

    @DeleteMapping("/{id}")
    public void deleteText(@PathVariable("id") Integer textId) {
        textService.deleteText(textId);
    }

}
