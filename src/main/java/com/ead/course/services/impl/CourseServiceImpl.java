package com.ead.course.services.impl;

import com.ead.course.models.CourseModel;
import com.ead.course.models.LessonModel;
import com.ead.course.models.ModuleModel;
import com.ead.course.repositories.CourseRepository;
import com.ead.course.services.CourseService;
import com.ead.course.services.LessonService;
import com.ead.course.services.ModuleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final LessonService lessonService;
    private final ModuleService moduleService;

    @Transactional
    @Override
    public void delete(CourseModel courseModel) {
        List<ModuleModel> moduleModels = moduleService.findByIdCourse(courseModel.getCourseId());
        if (!moduleModels.isEmpty()) {
            for (ModuleModel moduleModel : moduleModels) {
                List<LessonModel> lessonModels = lessonService.findByIdModule(moduleModel.getModuleId());
                if (!lessonModels.isEmpty()) {
                    lessonService.deleteAll(lessonModels);
                }
            }
            moduleService.deleteAll(moduleModels);
        }
        courseRepository.delete(courseModel);
    }
}
