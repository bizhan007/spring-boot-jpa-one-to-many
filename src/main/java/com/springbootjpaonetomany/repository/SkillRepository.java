package com.springbootjpaonetomany.repository;

import com.springbootjpaonetomany.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

    Skill findSkillById(Long id);
    void deleteSkillById(Long id);

    List<Skill> getSkillsByPersonId(Long personId);

}
