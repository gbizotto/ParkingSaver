package br.gbizotto.parkingsaver.model;

import java.io.Serializable;

/**
 * Created by Gabriela on 21/01/2018.
 */

public class Product implements Serializable {

    private int id;
    private String name;
    private Boolean bought;
    private Float price;

    public Product(String name) {
        this.name = name;
        this.bought = false;
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

    public Boolean getBought() {
        return bought;
    }

    public void setBought(Boolean bought) {
        this.bought = bought;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
