package com.renkoglu.ross3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Foods")
public class Food implements IEntity{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Title")
    private String title;

    public Food(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Food() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
