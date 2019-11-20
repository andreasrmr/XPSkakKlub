package com.dat18c.xpskakklub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyInfo {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String phone;
    private String name;

    public CompanyInfo() {
    }

    public CompanyInfo(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
