package com.example.newsoap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue
    private Long iin;
    private String name;
    private String date;

    public Long getIin() {
        return iin;
    }

    public void setIin(Long iin) {
        this.iin = iin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public UserEntity() {
    }

    public UserEntity(String name, String date) {
        this.name = name;
        this.date = date;
    }
}
