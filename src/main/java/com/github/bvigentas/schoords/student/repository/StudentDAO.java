package com.github.bvigentas.schoords.student.repository;

import com.github.bvigentas.schoords.student.dto.StudentFilter;
import com.github.bvigentas.schoords.student.entity.Student;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StudentDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Student> searchStudent(StudentFilter filter) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = builder.createQuery(Student.class);
        Root<Student> student = criteriaQuery.from(Student.class);

        Predicate name = null;
        Predicate date = null;

        if (StringUtils.isNotEmpty(filter.getName())) {
            name = builder.like(student.get("name"), filter.getName());
        }

        if (filter.getInitialCreationDate().isBefore(filter.getFinalCreationDate())) {
            date = builder.between(student.get("creation-date"), filter.getInitialCreationDate(), filter.getFinalCreationDate());
        }

        if (name != null && date != null) {
            criteriaQuery.where(name, date);
        }

        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);

        return query.getResultList();

    }

}
