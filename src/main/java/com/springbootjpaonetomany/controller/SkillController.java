package com.springbootjpaonetomany.controller;

import com.springbootjpaonetomany.model.Skill;
import com.springbootjpaonetomany.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/api/v1/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Skill> getSkillById(@PathVariable Long id) {
        Skill skill = skillService.findSkillById(id);
        if (skill == null) {
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Skill>> getAllSkills() {
        List<Skill> skills = skillService.findAllSkill();
        if (skills == null) {
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Skill> createSkill(@RequestBody @Valid Skill skill) {
        if(skill == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        skill.setCreated(new Timestamp(System.currentTimeMillis()));
        skill.setUpdated(new Timestamp(System.currentTimeMillis()));
        skillService.createSkill(skill);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Skill> updateSkill(@RequestBody @Valid Skill skill) {
        if(skill == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        skill.setUpdated(new Timestamp(System.currentTimeMillis()));
        skillService.updateSkill(skill);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Skill> deleteSkillById(@PathVariable Long id) {
        Skill skill = skillService.findSkillById(id);
        if (skill == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        skillService.deleteSkillById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/personId/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Skill>> getSkillsByPersonId(@PathVariable Long personId) {
        List<Skill> skills = skillService.getSkillsByPersonId(personId);
        if (skills == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
}
