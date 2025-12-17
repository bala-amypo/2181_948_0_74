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

@Column(unique=true)
private String vechicleNumber;

private Double capacityKg;
private Double fuelEfficiency;

public Long getId(){
    return id;
}
public void setId(Long id){
    this.id=id;
}

public User getUser(){
    return user;
}
public void setUser(User user){
    this.user=user;
}

public String getVehicleNumber(){
    return id;
}
public void setId(Long id){
    this.id=id;
}

public Long getId(){
    return id;
}
public void setId(Long id){
    this.id=id;
}

public Long getId(){
    return id;
}
public void setId(Long id){
    this.id=id;
}

}