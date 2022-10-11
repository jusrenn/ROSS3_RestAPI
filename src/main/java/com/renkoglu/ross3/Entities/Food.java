package com.renkoglu.ross3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Foods")
public class Food implements IEntity{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    public Food(int id, String title) {
        this.id = id;
        this.name = name;
    }

    public Food() {}

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
}
