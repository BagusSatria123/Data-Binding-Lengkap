package com.bagus.databinding.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ClassD implements Parcelable {
    private String hargaBeasiswa;

    public ClassD() {
    }

    public ClassD(String hargaBeasiswa) {
        this.hargaBeasiswa = hargaBeasiswa;
    }

    public String getHargaBeasiswa() {
        return hargaBeasiswa;
    }

    public void setHargaBeasiswa(String hargaBeasiswa) {
        this.hargaBeasiswa = hargaBeasiswa;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.hargaBeasiswa);
    }

    protected ClassD(Parcel in) {
        this.hargaBeasiswa = in.readString();
    }

    public static final Parcelable.Creator<ClassD> CREATOR = new Parcelable.Creator<ClassD>() {
        @Override
        public ClassD createFromParcel(Parcel source) {
            return new ClassD(source);
        }

        @Override
        public ClassD[] newArray(int size) {
            return new ClassD[size];
        }
    };
}
