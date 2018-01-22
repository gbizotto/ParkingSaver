package br.gbizotto.parkingsaver.purchases.viewModel;

import android.databinding.BaseObservable;

import br.gbizotto.parkingsaver.model.Product;

/**
 * Created by Gabriela on 21/01/2018.
 */

public class ProductViewModel extends BaseObservable {

    private int id;
    private String name;
    private Boolean bought;
    private String price;

    public ProductViewModel(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.bought = product.getBought();
        this.price = product.getPrice().toString();
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
