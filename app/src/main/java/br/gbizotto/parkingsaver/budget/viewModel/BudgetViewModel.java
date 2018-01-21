package br.gbizotto.parkingsaver.budget.viewModel;

import android.app.Activity;
import android.databinding.BaseObservable;
import android.util.Log;

import br.gbizotto.parkingsaver.budget.BudgetCommunication;
import br.gbizotto.parkingsaver.model.Budget;

/**
 * Created by Gabriela on 21/01/2018.
 */

public class BudgetViewModel extends BaseObservable {

    private String budget;
    private BudgetCommunication budgetCommunication;

    public BudgetViewModel(BudgetCommunication budgetCommunication) {
        this.budgetCommunication = budgetCommunication;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public void onNextClick() {
        Log.d(BudgetViewModel.class.getSimpleName(), "budget: " + this.budget);
        if (this.budget != null && this.budgetCommunication != null) {
            this.budgetCommunication.saveBudget(Float.valueOf(this.budget));
            this.budgetCommunication.goToNext();
        }
    }
}
