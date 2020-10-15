package com.bagus.databinding.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ClassB implements Parcelable {
    private String pilihanPoliteknik;

    public ClassB() {
    }

    public ClassB(String pilihanPoliteknik) {
        this.pilihanPoliteknik = pilihanPoliteknik;
    }

    public String getPilihanPoliteknik() {
        return pilihanPoliteknik;
    }

    public void setPilihanPoliteknik(String pilihanPoliteknik) {
        this.pilihanPoliteknik = pilihanPoliteknik;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.pilihanPoliteknik);
    }

    protected ClassB(Parcel in) {
        this.pilihanPoliteknik = in.readString();
    }



    public static final Parcelable.Creator<ClassB> CREATOR = new Parcelable.Creator<ClassB>() {
        @Override
        public ClassB createFromParcel(Parcel source) {
            return new ClassB(source);
        }

        @Override
        public ClassB[] newArray(int size) {
            return new ClassB[size];
        }
    };


}
