package com.g5.Knight2MeetYou.entity;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    private String username;
    private @Id @GeneratedValue (strategy = GenerationType.IDENTITY) Long id;
    private String hashedPassword;
    

    public User(String username, Long id, String hashedPassword) {
        this.username = username;
        this.id = id;
        this.hashedPassword = hashedPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    


    
}
