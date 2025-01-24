package com.ead.course.services;

import com.ead.course.models.LessonModel;

import java.util.List;
import java.util.UUID;

public interface LessonService {
    List<LessonModel> findByIdModule(UUID idModule);
    void deleteAll(List<LessonModel> lessonModels);
}
