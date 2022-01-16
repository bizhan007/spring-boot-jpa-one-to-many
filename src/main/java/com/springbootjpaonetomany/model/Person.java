package com.springbootjpaonetomany.model;

import jdk.jfr.Timespan;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "person",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Skill> skills;

    @CreatedDate
    private Date created;

    @LastModifiedDate
    private Date updated;

}

