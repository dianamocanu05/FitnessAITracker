package com.example.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String email;
    private String name;
    private String password;
    private int age;
    private double weight;
    private double height;
    private FitnessGoals fitnessGoal;
}
