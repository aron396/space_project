// CrewMemberDecorator.java

package com.example.map.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "crewmember_decorators")
public class CrewMemberDecorator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String helmet;
    private String shield;

    public CrewMemberDecorator() {
    }

    public CrewMemberDecorator(int id, String helmet, String shield) {
        this.id = id;
        this.helmet = helmet;
        this.shield = shield;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }
}



