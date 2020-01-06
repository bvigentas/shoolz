package com.github.bvigentas.schoords.grade.repository;

import com.github.bvigentas.schoords.grade.dto.GradeFilter;
import com.github.bvigentas.schoords.grade.entity.Grade;
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
public class GradeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Grade> searchGrade(GradeFilter filter) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Grade> criteriaQuery = builder.createQuery(Grade.class);
        Root<Grade> grade = criteriaQuery.from(Grade.class);

        Predicate student = null;
        Predicate subject = null;

        if (filter.getSubject() != null) {
            builder.equal(grade.get("subject"), filter.getSubject());

        }

        if (filter.getStudent() != null) {
            builder.equal(grade.get("student"), filter.getStudent());
        }

        criteriaQuery.where(student, subject);


        TypedQuery<Grade> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();

    }
}
