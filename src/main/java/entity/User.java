package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name='User')
public class User{
    @Id
    private long id;

    private String name;

    @Coloumn(unique=true)
    private Stringemail;

    private Stringpassword;
    
}