package br.gbizotto.parkingsaver.purchases.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.gbizotto.parkingsaver.R;
import br.gbizotto.parkingsaver.model.Product;

public class PurchasesActivity extends AppCompatActivity {

    private List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchases);

        //FIXME use real list!
        fillList();
    }

    private void fillList() {
        products = new ArrayList<>();
        products.add(new Product("arroz"));
        products.add(new Product("ervilha"));
        products.add(new Product("xampu"));
        products.add(new Product("suco"));

    }
}
