package com.renkoglu.ross3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Pages")
public class Page implements IEntity{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Content")
    private String content;

    public Page(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Page() {}

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
