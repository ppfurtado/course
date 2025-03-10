package com.ead.course.repositories;

import com.ead.course.models.CourseModel;
import com.ead.course.models.LessonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface LessonRepository extends JpaRepository<LessonModel, UUID>, JpaSpecificationExecutor<LessonModel> {
}
