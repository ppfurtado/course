package com.ead.course.specifications;

import com.ead.course.models.ModuleModel;
import org.springframework.data.jpa.domain.Specification;

import java.util.UUID;

public class ModuleSpecification {

   public static Specification<ModuleModel> findByIdCourse(UUID idCourse){
        return (root, query, cb) -> idCourse == null ? cb.conjunction() :
        cb.equal(root.get("courses").get("courseId"), idCourse);
    }

}
