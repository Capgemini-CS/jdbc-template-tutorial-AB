package com.capgemini.tutorialsjdbctemplate.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Tutorial {
    private long id;
    private String title;
    private String description;
    private boolean published;

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
}
