package com.dat18c.xpskakklub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contingent {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    int id;
    private String category;
    private int price;

    public Contingent() {
    }

    public Contingent(String category, int price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
