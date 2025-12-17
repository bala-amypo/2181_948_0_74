package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name="Vehicles")
public class Vehicle{
@Id
@Generatedvalue(strategy.GenerationType.IDENTITY)
private Long id;

@ManyToOne
private User user;

private 
}