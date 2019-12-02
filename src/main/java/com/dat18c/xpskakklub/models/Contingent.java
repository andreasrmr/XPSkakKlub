package com.dat18c.xpskakklub.models;

import javax.persistence.*;

@Entity
public class Contingent {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    int id;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
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
