package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String city;
    private Certificate certi;

    public Student(int id, String name, String city, Certificate certi) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.certi = certi;
    }

    public Certificate getCerti() {
        return certi;
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }

    public Student() {
        super();
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
    }

}
