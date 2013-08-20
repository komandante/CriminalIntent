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
    }

    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c);
        }
        return sCrimeLab;
    }

    public void addCrime(Crime crime) {
        mCrimes.add(crime);
        mCrimesMap.put(crime.getId(), crime);
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        return mCrimesMap.get(id);
    }
}
