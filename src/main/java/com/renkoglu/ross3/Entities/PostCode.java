package com.renkoglu.ross3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Post_Codes")
public class PostCode implements IEntity{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Post_Code")
    private String postCode;

    public PostCode(int id, String postCode) {
        this.id = id;
        this.postCode = postCode;
    }

    public PostCode() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
