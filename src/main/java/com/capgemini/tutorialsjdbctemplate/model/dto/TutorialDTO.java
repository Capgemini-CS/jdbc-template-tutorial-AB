package com.capgemini.tutorialsjdbctemplate.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TutorialDTO {
    private long id;
    private String title;
    private String description;
    private boolean published;

    public TutorialDTO(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
}
