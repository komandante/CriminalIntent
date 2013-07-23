package ru.gavr.android.criminalintent.activity;

import android.support.v4.app.Fragment;
import ru.gavr.android.criminalintent.fragment.CrimeListFragment;

/**
 * @author Alexander Gavrilenko
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
