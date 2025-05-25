package org.example.backendproject.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {
    @Id
    private Long id;

    private String name;

    private String password;

    private String email;
    public Client() {

    }

    public Client(String name, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
