//package com.example.map.Model;
//
//import jakarta.persistence.*;
//
//import java.io.Serializable;
//
//@Entity
//@Table(name = "Crewmembers")
//public class CrewMember implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String name;
//    private String position;
//
//    @ManyToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "body_id", referencedColumnName = "id")
//    private Body body;
//
//    public CrewMember(int id, String name, String position, Body body) {
//        this.id = id;
//        this.name = name;
//        this.position = position;
//        this.body = body;
//    }
//
//    public CrewMember() {
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public Body getBody() {
//        return body;
//    }
//
//    public void setBody(Body body) {
//        this.body = body;
//    }
//}

// CrewMember.java

//package com.example.map.Model;
//
//import jakarta.persistence.*;
//
//import java.io.Serializable;
//
//@Entity
//@Table(name = "crewmembers")
//public class CrewMember implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String name;
//    private String position;
//
//    @OneToOne
//    @JoinColumn(name = "body_id", unique = true, nullable = false)
//    private Body body;
//
//    public CrewMember() {
//    }
//
//    public CrewMember(int id, String name, String position, Body body) {
//        this.id = id;
//        this.name = name;
//        this.position = position;
//        this.body = body;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public Body getBody() {
//        return body;
//    }
//
//    public void setBody(Body body) {
//        this.body = body;
//    }
//}

// CrewMember.java

package com.example.map.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "crewmembers")
public class CrewMember implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String position;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "crew_member_id", unique = true, nullable = false)
    private CrewMemberDecorator decorator;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "body_id", unique = true, nullable = false)
    private Body body;

    public CrewMember() {
    }

    public CrewMember(int id, String name, String position, Body body) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public CrewMemberDecorator getDecorator() {
        return decorator;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}


