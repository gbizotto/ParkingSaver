package br.gbizotto.parkingsaver.purchases.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import br.gbizotto.parkingsaver.R;
import br.gbizotto.parkingsaver.model.Product;
import br.gbizotto.parkingsaver.purchases.adapter.PurchaseAdapter;
import br.gbizotto.parkingsaver.purchases.viewModel.ProductViewModel;
import butterknife.BindView;

public class PurchasesActivity extends AppCompatActivity {

    @BindView(R.id.list_products)
    RecyclerView mRecyclerView;

    private PurchaseAdapter mAdapter;

    private List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchases);

        initRecyclerView();

        //FIXME use real list!
        fillList();

        fillRecyclerView();
    }

    private void initRecyclerView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void fillRecyclerView() {
        if (mAdapter == null) {
            mAdapter = new PurchaseAdapter(transformList(), this);
        } else {
            mAdapter.setProducts(transformList());
        }
        mRecyclerView.setAdapter(mAdapter);
    }

    private List<ProductViewModel> transformList() {
        List<ProductViewModel> list = new ArrayList<>();
        for(Product product: products) {
            list.add(new ProductViewModel(product));
        }
        return list;
    }

    private void fillList() {
        products = new ArrayList<>();
        products.add(new Product("arroz"));
        products.add(new Product("ervilha"));
        products.add(new Product("xampu"));
        products.add(new Product("suco"));
    }
}
