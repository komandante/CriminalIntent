package ru.gavr.android.criminalintent.fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;
import ru.gavr.android.criminalintent.CrimeLab;
import ru.gavr.android.criminalintent.R;
import ru.gavr.android.criminalintent.domain.Crime;

import java.util.List;

/**
 * @author Alexander Gavrilenko
 */
public class CrimeListFragment extends ListFragment {

    private List<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();

        ArrayAdapter<Crime> adapter = new ArrayAdapter<Crime>(getActivity(), android.R.layout.simple_list_item_1, mCrimes);
        setListAdapter(adapter);
    }
}
