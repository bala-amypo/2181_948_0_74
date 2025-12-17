package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
public class Location{
    @Id
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;

    
}