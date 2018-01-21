package br.gbizotto.parkingsaver.budget.viewModel;

import android.databinding.BaseObservable;
import android.util.Log;

/**
 * Created by Gabriela on 21/01/2018.
 */

public class BudgetViewModel extends BaseObservable {

    private String budget;

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public void onNextClick() {
        Log.d(BudgetViewModel.class.getSimpleName(), "budget: " + this.budget);
    }
}
