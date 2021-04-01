package com.textservice.demo.repository.textstory;

import com.textservice.demo.model.TextStory;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface TextStoryDAO {

    List<TextStory> getAllTexts();

    TextStory saveText(TextStory textStory);

    TextStory getText(Integer id);

    void deleteTextStory(Integer id);

}
