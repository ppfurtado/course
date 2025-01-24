package com.ead.course.services.impl;

import com.ead.course.models.ModuleModel;
import com.ead.course.repositories.ModuleRepository;
import com.ead.course.services.ModuleService;
import com.ead.course.specifications.ModuleSpecification;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ModuleServiceImpl implements ModuleService {

    private final ModuleRepository moduleRepository;

    @Override
    public List<ModuleModel> findByIdCourse(UUID idCourse) {
        return moduleRepository.findAll(ModuleSpecification.findByIdCourse(idCourse));
    }

    @Override
    public void deleteAll(List<ModuleModel> moduleModels) {
        moduleRepository.deleteAll(moduleModels);
    }
}
