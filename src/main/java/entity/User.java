package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name='users')
public class User{
    @Id
    @Generatedvalue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique=true)
    private String email;

    private String password;

    private String role;

    public 


}