package com.bagus.databinding.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ClassC implements Parcelable {
    private String NamaSekolahMenengah,AlamatSekolahMenengah,KabupatenMenengah,ProvinsiMenengah;
    private String TahunMenengah,JumlahNilaiMenengah,JumlahMataPelajaranMenengah;

    public ClassC() {
    }

    public ClassC(String namaSekolahMenengah, String alamatSekolahMenengah,
                  String kabupatenMenengah, String provinsiMenengah, String tahunMenengah,
                  String jumlahNilaiMenengah, String jumlahMataPelajaranMenengah) {
        this.NamaSekolahMenengah = namaSekolahMenengah;
        this.AlamatSekolahMenengah = alamatSekolahMenengah;
        this.KabupatenMenengah = kabupatenMenengah;
        this.ProvinsiMenengah = provinsiMenengah;
        this.TahunMenengah = tahunMenengah;
        this.JumlahNilaiMenengah = jumlahNilaiMenengah;
        this.JumlahMataPelajaranMenengah = jumlahMataPelajaranMenengah;
    }

    public String getNamaSekolahMenengah() {
        return NamaSekolahMenengah;
    }

    public void setNamaSekolahMenengah(String namaSekolahMenengah) {
        NamaSekolahMenengah = namaSekolahMenengah;
    }

    public String getAlamatSekolahMenengah() {
        return AlamatSekolahMenengah;
    }

    public void setAlamatSekolahMenengah(String alamatSekolahMenengah) {
        AlamatSekolahMenengah = alamatSekolahMenengah;
    }

    public String getKabupatenMenengah() {
        return KabupatenMenengah;
    }

    public void setKabupatenMenengah(String kabupatenMenengah) {
        KabupatenMenengah = kabupatenMenengah;
    }

    public String getProvinsiMenengah() {
        return ProvinsiMenengah;
    }

    public void setProvinsiMenengah(String provinsiMenengah) {
        ProvinsiMenengah = provinsiMenengah;
    }

    public String getTahunMenengah() {
        return TahunMenengah;
    }

    public void setTahunMenengah(String tahunMenengah) {
        TahunMenengah = tahunMenengah;
    }

    public String getJumlahNilaiMenengah() {
        return JumlahNilaiMenengah;
    }

    public void setJumlahNilaiMenengah(String jumlahNilaiMenengah) {
        JumlahNilaiMenengah = jumlahNilaiMenengah;
    }

    public String getJumlahMataPelajaranMenengah() {
        return JumlahMataPelajaranMenengah;
    }

    public void setJumlahMataPelajaranMenengah(String jumlahMataPelajaranMenengah) {
        JumlahMataPelajaranMenengah = jumlahMataPelajaranMenengah;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.NamaSekolahMenengah);
        dest.writeString(this.AlamatSekolahMenengah);
        dest.writeString(this.KabupatenMenengah);
        dest.writeString(this.ProvinsiMenengah);
        dest.writeString(this.TahunMenengah);
        dest.writeString(this.JumlahNilaiMenengah);
        dest.writeString(this.JumlahMataPelajaranMenengah);
    }

    protected ClassC(Parcel in) {
        this.NamaSekolahMenengah = in.readString();
        this.AlamatSekolahMenengah = in.readString();
        this.KabupatenMenengah = in.readString();
        this.ProvinsiMenengah = in.readString();
        this.TahunMenengah = in.readString();
        this.JumlahNilaiMenengah = in.readString();
        this.JumlahMataPelajaranMenengah = in.readString();
    }

    public static final Parcelable.Creator<ClassC> CREATOR = new Parcelable.Creator<ClassC>() {
        @Override
        public ClassC createFromParcel(Parcel source) {
            return new ClassC(source);
        }

        @Override
        public ClassC[] newArray(int size) {
            return new ClassC[size];
        }
    };


}
