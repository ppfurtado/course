package com.ead.course.services;

import com.ead.course.models.ModuleModel;

import java.util.List;
import java.util.UUID;

public interface ModuleService {
    List<ModuleModel> findByIdCourse(UUID idCourse);
    void deleteAll(List<ModuleModel> moduleModels);
}
