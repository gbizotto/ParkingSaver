package br.gbizotto.parkingsaver.model;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import br.gbizotto.parkingsaver.R;

/**
 * Created by Gabriela on 21/01/2018.
 */

public class Budget {

    public Float getBudget(Activity activity) {
        return activity.getPreferences(Context.MODE_PRIVATE).getFloat(activity.getString(R.string.budget_key), 0f);
    }

    public void setBudget(Activity activity, Float budget) {
        SharedPreferences sharedPref = activity.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putFloat(activity.getString(R.string.budget_key), budget);
        editor.commit();
    }
}
