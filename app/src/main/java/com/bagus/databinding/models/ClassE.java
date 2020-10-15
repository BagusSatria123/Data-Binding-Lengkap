package com.bagus.databinding.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ClassE implements Parcelable {

    private String suratMiskin,suratGajiOrtu,FcListrik,prestasi,ijazah,Rekom,FcRaport;

    public ClassE() {
    }

    public ClassE(String suratMiskin, String suratGajiOrtu, String fcListrik, String prestasi,
                  String ijazah, String rekom, String fcRaport) {
        this.suratMiskin = suratMiskin;
        this.suratGajiOrtu = suratGajiOrtu;
        this.FcListrik = fcListrik;
        this.prestasi = prestasi;
        this.ijazah = ijazah;
        this.Rekom = rekom;
        this.FcRaport = fcRaport;
    }

    public String getSuratMiskin() {
        return suratMiskin;
    }

    public void setSuratMiskin(String suratMiskin) {
        this.suratMiskin = suratMiskin;
    }

    public String getSuratGajiOrtu() {
        return suratGajiOrtu;
    }

    public void setSuratGajiOrtu(String suratGajiOrtu) {
        this.suratGajiOrtu = suratGajiOrtu;
    }

    public String getFcListrik() {
        return FcListrik;
    }

    public void setFcListrik(String fcListrik) {
        FcListrik = fcListrik;
    }

    public String getPrestasi() {
        return prestasi;
    }

    public void setPrestasi(String prestasi) {
        this.prestasi = prestasi;
    }

    public String getIjazah() {
        return ijazah;
    }

    public void setIjazah(String ijazah) {
        this.ijazah = ijazah;
    }

    public String getRekom() {
        return Rekom;
    }

    public void setRekom(String rekom) {
        Rekom = rekom;
    }

    public String getFcRaport() {
        return FcRaport;
    }

    public void setFcRaport(String fcRaport) {
        FcRaport = fcRaport;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.suratMiskin);
        dest.writeString(this.suratGajiOrtu);
        dest.writeString(this.FcListrik);
        dest.writeString(this.prestasi);
        dest.writeString(this.ijazah);
        dest.writeString(this.Rekom);
        dest.writeString(this.FcRaport);
    }

    protected ClassE(Parcel in) {
        this.suratMiskin = in.readString();
        this.suratGajiOrtu = in.readString();
        this.FcListrik = in.readString();
        this.prestasi = in.readString();
        this.ijazah = in.readString();
        this.Rekom = in.readString();
        this.FcRaport = in.readString();
    }

    public static final Parcelable.Creator<ClassE> CREATOR = new Parcelable.Creator<ClassE>() {
        @Override
        public ClassE createFromParcel(Parcel source) {
            return new ClassE(source);
        }

        @Override
        public ClassE[] newArray(int size) {
            return new ClassE[size];
        }
    };


}
