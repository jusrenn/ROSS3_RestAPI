package com.renkoglu.ross3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Settings")
public class Setting implements IEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Parameter")
    private String parameter;

    @Column(name = "Value")
    private String value;

    @Column(name = "Access_Level")
    private String accessLevel;

    public Setting(int id, String parameter, String value, String accessLevel) {
        this.id = id;
        this.parameter = parameter;
        this.value = value;
        this.accessLevel = accessLevel;
    }

    public Setting() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
}
