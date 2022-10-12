package com.renkoglu.ross3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Api_Keys")
public class ApiKey implements IEntity{
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Ross_User")
    private String rossUser;

    @Column(name = "Ross_Key")
    private String rossKey;

    public ApiKey(int id, String rossUser, String rossKey) {
        this.id = id;
        this.rossUser = rossUser;
        this.rossKey = rossKey;
    }

    public ApiKey() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRossUser() {
        return rossUser;
    }

    public void setRossUser(String rossUser) {
        this.rossUser = rossUser;
    }

    public String getRossKey() {
        return rossKey;
    }

    public void setRossKey(String rossKey) {
        this.rossKey = rossKey;
    }
}
