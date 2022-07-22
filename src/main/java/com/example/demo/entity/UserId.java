package com.example.demo.entity;


import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "USER_ID")
@Data
public class UserId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


}
