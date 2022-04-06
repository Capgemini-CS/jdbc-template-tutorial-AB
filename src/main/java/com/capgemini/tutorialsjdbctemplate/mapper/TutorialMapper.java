package com.capgemini.tutorialsjdbctemplate.mapper;

import com.capgemini.tutorialsjdbctemplate.model.Tutorial;
import com.capgemini.tutorialsjdbctemplate.model.dto.TutorialDTO;
import org.dozer.DozerBeanMapper;

public class TutorialMapper {
    public static TutorialDTO toDTO (Tutorial tutorial) {
        TutorialDTO tutorialDTO = new DozerBeanMapper().map(tutorial, TutorialDTO.class);
        return tutorialDTO;
    }

    public static Tutorial toEntity(TutorialDTO tutorialDTO) {
        return new DozerBeanMapper().map(tutorialDTO, Tutorial.class);

    }
}
