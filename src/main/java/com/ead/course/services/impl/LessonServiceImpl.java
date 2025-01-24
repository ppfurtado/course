package com.ead.course.services.impl;

import com.ead.course.models.LessonModel;
import com.ead.course.repositories.LessonRepository;
import com.ead.course.services.LessonService;
import com.ead.course.specifications.LessonSpecification;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;

    @Override
    public List<LessonModel> findByIdModule(UUID idModule) {
        return lessonRepository.findAll(LessonSpecification.findByIdModule(idModule));
    }

    @Override
    public void deleteAll(List<LessonModel> lessonModels) {
        lessonRepository.deleteAll(lessonModels);
    }
}
