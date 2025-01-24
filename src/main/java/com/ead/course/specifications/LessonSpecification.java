package com.ead.course.specifications;

import com.ead.course.models.LessonModel;
import org.springframework.data.jpa.domain.Specification;

import java.util.UUID;

public class LessonSpecification {

    public static Specification<LessonModel> findByIdModule(UUID idModule){
        return (root, query, cb) -> idModule == null ? cb.conjunction() :
        cb.equal(root.get("module").get("moduleId"), idModule);
    }

}
