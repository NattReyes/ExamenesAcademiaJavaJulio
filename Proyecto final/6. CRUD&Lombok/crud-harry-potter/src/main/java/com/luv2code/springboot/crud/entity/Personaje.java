package com.luv2code.springboot.crud.entity;
import jakarta.persistence.*;
import lombok.Data;

//Se implementa lombok
@Data
@Entity
@Table(name="personaje")
public class Personaje {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="house")
    private String house;


    // define constructors
    public Personaje() {

    }

    public Personaje(String firstName, String lastName, String house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }

}








