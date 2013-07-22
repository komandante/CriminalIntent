package ru.gavr.android.criminalintent;

import android.content.Context;
import ru.gavr.android.criminalintent.domain.Crime;

import java.util.*;

/**
 * @author Alexander Gavrilenko
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private List<Crime> mCrimes;
    private Map<UUID, Crime> mCrimesMap;

    private CrimeLab(Context appContext) {
        this.mAppContext = appContext;
        this.mCrimes = new ArrayList<>();
        mCrimesMap = new HashMap<>();
        fillCrimes();
    }

    private void fillCrimes() {
        for (int i = 0; i < 100; i++) {
            Crime c = new Crime();
            c.setTitle("Crime #" + i);
            c.setSolved(i % 2 == 0);
            mCrimes.add(c);
            mCrimesMap.put(c.getId(), c);
        }
    }

    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c);
        }
        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        return mCrimesMap.get(id);
    }
}
