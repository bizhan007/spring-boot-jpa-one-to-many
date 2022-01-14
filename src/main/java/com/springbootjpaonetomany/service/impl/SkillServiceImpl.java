package com.springbootjpaonetomany.service.impl;

import com.springbootjpaonetomany.model.Skill;
import com.springbootjpaonetomany.repository.SkillRepository;
import com.springbootjpaonetomany.service.SkillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Skill findSkillById(Long id) {
        return skillRepository.findSkillById(id);
    }

    @Override
    public List<Skill> findAllSkill() {
        return skillRepository.findAll();
    }

    @Override
    public Skill createSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Skill updateSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public void deleteSkillById(Long id) {
        skillRepository.deleteSkillById(id);
    }

    @Override
    public List<Skill> getSkillsByPersonId(Long personId) {
        return skillRepository.getSkillsByPersonId(personId);
    }

}
