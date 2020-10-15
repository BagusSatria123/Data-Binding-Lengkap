package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.bagus.databinding.databinding.ActivityMainCBinding;
import com.bagus.databinding.models.ClassA;
import com.bagus.databinding.models.ClassB;
import com.bagus.databinding.models.ClassC;

public class MainActivityC extends AppCompatActivity {
    ClassC classC;
    ClassA classA;
    ClassB classB;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        final ActivityMainCBinding binding2 = DataBindingUtil.setContentView(this,R.layout.activity_main_c);
        classC = new ClassC();
        classA = getIntent().getExtras().getParcelable("MAHASISWA1");
        classB = getIntent().getExtras().getParcelable("PilihanPoltek1");


        binding2.Next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                classC.setNamaSekolahMenengah(binding2.IsiNamaSekolahMenengah.getText().toString());
                classC.setAlamatSekolahMenengah(binding2.IsiAlamatSekolah.getText().toString());
                classC.setKabupatenMenengah(binding2.IsiKabupatenKotaC.getText().toString());
                classC.setProvinsiMenengah(binding2.IsiProvinsiC.getText().toString());
                classC.setTahunMenengah(binding2.IsiTahunC.getText().toString());
                classC.setJumlahNilaiMenengah(binding2.IsiJumlahNilai.getText().toString());
                classC.setJumlahMataPelajaranMenengah(binding2.IsiJumlahMataPelajaran.getText().toString());

                Intent intent = new Intent(getApplicationContext(),DetailActivity3.class);
                // put mahasiswa object to extra
                intent.putExtra("SekolahMenengah1",classC);

                startActivity(intent);
            }
        });

        btn = findViewById(R.id.Lanjut35);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivityD.class);
                intent.putExtra("MAHASISWA1", classA);
                intent.putExtra("PilihanPoltek1",classB);
                intent.putExtra("SekolahMenengah1",classC);

                startActivity(intent);
            }
        });
    }
}