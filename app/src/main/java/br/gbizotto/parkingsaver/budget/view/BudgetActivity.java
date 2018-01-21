package br.gbizotto.parkingsaver.budget.view;

import android.databinding.DataBindingUtil;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.concretesolutions.canarinho.watcher.ValorMonetarioWatcher;
import br.gbizotto.parkingsaver.R;
import br.gbizotto.parkingsaver.budget.viewModel.BudgetViewModel;
import br.gbizotto.parkingsaver.databinding.ActivityBudgetBinding;
import butterknife.BindView;
import butterknife.ButterKnife;

public class BudgetActivity extends AppCompatActivity {

    @BindView(R.id.edt_budget)
    TextInputEditText mBudgetEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityBudgetBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_budget);
        binding.setBudgetViewModel(new BudgetViewModel());

        ButterKnife.bind(this);

        addListeners();
    }

    private void addListeners() {
        mBudgetEdt.addTextChangedListener(new ValorMonetarioWatcher.Builder()
                .comSimboloReal()
                .comMantemZerosAoLimpar()
                .build());
    }
}
