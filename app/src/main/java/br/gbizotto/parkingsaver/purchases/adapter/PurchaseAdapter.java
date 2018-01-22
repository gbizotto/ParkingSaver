package br.gbizotto.parkingsaver.purchases.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.gbizotto.parkingsaver.R;
import br.gbizotto.parkingsaver.databinding.ProductRowBinding;
import br.gbizotto.parkingsaver.purchases.viewModel.ProductViewModel;

/**
 * Created by Gabriela on 21/01/2018.
 */

public class PurchaseAdapter extends RecyclerView.Adapter<PurchaseAdapter.ViewHolder> {

    private List<ProductViewModel> products;
    private Context mContext;

    public PurchaseAdapter(List<ProductViewModel> products, Context context) {
        this.products = products;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        ProductRowBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.product_row, parent, false);
        return new PurchaseAdapter.ViewHolder(binding.getRoot(),binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindProduct(products.get(position));
    }

    @Override
    public int getItemCount() {
        if (products == null || products.isEmpty()) {
            return 0;
        }
        return products.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ProductRowBinding mBinding;

        public ViewHolder(View itemView, ProductRowBinding binding) {
            super(itemView);
            mBinding = binding;
        }

        public void bindProduct(ProductViewModel productViewModel) {
            mBinding.setProductViewModel(productViewModel);
            mBinding.executePendingBindings();
        }
    }
}
