package ru.gavr.android.criminalintent;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Alexander Gavrilenko
 */
public class Crime implements Serializable{
    private UUID mId;
    private String mTitle;

    public Crime() {
        this.mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
