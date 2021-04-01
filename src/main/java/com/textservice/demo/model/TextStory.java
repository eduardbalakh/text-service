package com.textservice.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "stories")
@Data
public class TextStory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String text;

    public TextStory() {
    }

    public TextStory(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextStory{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
