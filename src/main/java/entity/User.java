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

    public Long getID(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    
    public String getName(){
        return name;
    }
    public void setId(String name){
        this.name=name;
    }
    
    
    public string getEmail(){
        return email;
    }
    public void setId(String email)){
        this.email=email;
    }
    
    
    public String getPassword(){
        return password;
    }
    public void setId(String pssword){
        this.password=password;


    }
    
      
    public String getRole(){
        return role;
    }
    public void setId(String role){
        this.role=role;


    }
    


}