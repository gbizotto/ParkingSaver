package br.gbizotto.parkingsaver.budget.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import br.com.concretesolutions.canarinho.watcher.ValorMonetarioWatcher;
import br.gbizotto.parkingsaver.R;
import br.gbizotto.parkingsaver.budget.BudgetCommunication;
import br.gbizotto.parkingsaver.budget.viewModel.BudgetViewModel;
import br.gbizotto.parkingsaver.databinding.ActivityBudgetBinding;
import br.gbizotto.parkingsaver.model.Budget;
import br.gbizotto.parkingsaver.purchases.view.PurchasesActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class BudgetActivity extends AppCompatActivity implements BudgetCommunication {

    @BindView(R.id.edt_budget)
    TextInputEditText mBudgetEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityBudgetBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_budget);
        binding.setBudgetViewModel(new BudgetViewModel(this));

        ButterKnife.bind(this);

        addListeners();
    }

    private void addListeners() {
        mBudgetEdt.addTextChangedListener(new ValorMonetarioWatcher.Builder()
                .comSimboloReal()
                .comMantemZerosAoLimpar()
                .build());
    }

    @Override
    public void goToNext() {
        startActivity(new Intent(this, PurchasesActivity.class));
    }

    @Override
    public void saveBudget(Float budget) {
        if (budget == null) {
            new Budget().setBudget(this, budget);
        }
    }
}
