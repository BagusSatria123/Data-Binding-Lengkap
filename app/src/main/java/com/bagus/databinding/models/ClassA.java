package com.bagus.databinding.models;

import android.os.Parcel;
import android.os.Parcelable;

public class ClassA implements Parcelable {
    private String NamaLengkap,jenisKelamin,statusMaha,AgamaMaha,KewargaMaha,AlamatSurat;
    private String AlamatAsal,Kabupaten,Provinsi,NoRumah,NoHp,AlamatEmail,NamaOrtu,PendidikanOrtu;
    private String AsalUniv,AsalProdi,StatusMahaTrans;

    public ClassA() {
    }

    public ClassA(String namaLengkap, String jenisKelamin, String statusMaha, String agamaMaha,
                  String kewargaMaha, String alamatSurat, String alamatAsal, String kabupaten, String provinsi,
                  String noRumah, String noHp, String alamatEmail, String namaOrtu, String pendidikanOrtu,
                  String asalUniv, String asalProdi, String statusMahaTrans) {
        this.NamaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
        this.statusMaha = statusMaha;
        this.AgamaMaha = agamaMaha;
        this.KewargaMaha = kewargaMaha;
        this.AlamatSurat = alamatSurat;
        this.AlamatAsal = alamatAsal;
        this.Kabupaten = kabupaten;
        this.Provinsi = provinsi;
        this.NoRumah = noRumah;
        this.NoHp = noHp;
        this.AlamatEmail = alamatEmail;
        this.NamaOrtu = namaOrtu;
        this.PendidikanOrtu = pendidikanOrtu;
        this.AsalUniv = asalUniv;
        this.AsalProdi = asalProdi;
        this.StatusMahaTrans = statusMahaTrans;
    }

    public String getNamaLengkap() {
        return NamaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        NamaLengkap = namaLengkap;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatusMaha() {
        return statusMaha;
    }

    public void setStatusMaha(String statusMaha2) {
        this.statusMaha = statusMaha2;
    }

    public String getAgamaMaha() {
        return AgamaMaha;
    }

    public void setAgamaMaha(String agamaMaha) {
        AgamaMaha = agamaMaha;
    }

    public String getKewargaMaha() {
        return KewargaMaha;
    }

    public void setKewargaMaha(String kewargaMaha) {
        KewargaMaha = kewargaMaha;
    }

    public String getAlamatSurat() {
        return AlamatSurat;
    }

    public void setAlamatSurat(String alamatSurat) {
        AlamatSurat = alamatSurat;
    }

    public String getAlamatAsal() {
        return AlamatAsal;
    }

    public void setAlamatAsal(String alamatAsal) {
        AlamatAsal = alamatAsal;
    }

    public String getKabupaten() {
        return Kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        Kabupaten = kabupaten;
    }

    public String getProvinsi() {
        return Provinsi;
    }

    public void setProvinsi(String provinsi) {
        Provinsi = provinsi;
    }

    public String getNoRumah() {
        return NoRumah;
    }

    public void setNoRumah(String noRumah) {
        NoRumah = noRumah;
    }

    public String getNoHp() {
        return NoHp;
    }

    public void setNoHp(String noHp) {
        NoHp = noHp;
    }

    public String getAlamatEmail() {
        return AlamatEmail;
    }

    public void setAlamatEmail(String alamatEmail) {
        AlamatEmail = alamatEmail;
    }

    public String getNamaOrtu() {
        return NamaOrtu;
    }

    public void setNamaOrtu(String namaOrtu) {
        NamaOrtu = namaOrtu;
    }

    public String getPendidikanOrtu() {
        return PendidikanOrtu;
    }

    public void setPendidikanOrtu(String pendidikanOrtu) {
        PendidikanOrtu = pendidikanOrtu;
    }

    public String getAsalUniv() {
        return AsalUniv;
    }

    public void setAsalUniv(String asalUniv) {
        AsalUniv = asalUniv;
    }

    public String getAsalProdi() {
        return AsalProdi;
    }

    public void setAsalProdi(String asalProdi) {
        AsalProdi = asalProdi;
    }

    public String getStatusMahaTrans() {
        return StatusMahaTrans;
    }

    public void setStatusMahaTrans(String statusMahaTrans) {
        StatusMahaTrans = statusMahaTrans;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.NamaLengkap);
        dest.writeString(this.jenisKelamin);
        dest.writeString(this.statusMaha);
        dest.writeString(this.AgamaMaha);
        dest.writeString(this.KewargaMaha);
        dest.writeString(this.AlamatSurat);
        dest.writeString(this.AlamatAsal);
        dest.writeString(this.Kabupaten);
        dest.writeString(this.Provinsi);
        dest.writeString(this.NoRumah);
        dest.writeString(this.NoHp);
        dest.writeString(this.AlamatEmail);
        dest.writeString(this.NamaOrtu);
        dest.writeString(this.PendidikanOrtu);
        dest.writeString(this.AsalUniv);
        dest.writeString(this.AsalProdi);
        dest.writeString(this.StatusMahaTrans);

    }

    protected ClassA(Parcel in) {
        this.NamaLengkap = in.readString();
        this.jenisKelamin = in.readString();
        this.statusMaha = in.readString();
        this.AgamaMaha = in.readString();
        this.KewargaMaha = in.readString();
        this.AlamatSurat = in.readString();
        this.AlamatAsal = in.readString();
        this.Kabupaten = in.readString();
        this.Provinsi = in.readString();
        this.NoRumah = in.readString();
        this.NoHp = in.readString();
        this.AlamatEmail = in.readString();
        this.NamaOrtu = in.readString();
        this.PendidikanOrtu = in.readString();
        this.AsalUniv = in.readString();
        this.AsalProdi = in.readString();
        this.StatusMahaTrans = in.readString();

    }

    public static final Parcelable.Creator<ClassA> CREATOR = new Parcelable.Creator<ClassA>() {
        @Override
        public ClassA createFromParcel(Parcel source) {
            return new ClassA(source);
        }

        @Override
        public ClassA[] newArray(int size) {
            return new ClassA[size];
        }
    };


}
