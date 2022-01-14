package com.springbootjpaonetomany.service;

import com.springbootjpaonetomany.model.Skill;

import java.util.List;

public interface SkillService {

    Skill findSkillById(Long id);
    List<Skill> findAllSkill();
    Skill createSkill(Skill skill);
    Skill updateSkill(Skill skill);
    void deleteSkillById(Long id);

    List<Skill> getSkillsByPersonId(Long personId);

}
