package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.bagus.databinding.databinding.ActivityMainBinding;
import com.bagus.databinding.models.ClassA;

public class MainActivity extends AppCompatActivity {
    ClassA classA;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        classA = new ClassA();
        classA.setJenisKelamin("Laki - Laki");
        classA.setStatusMaha("Belum Menikah");
        classA.setKewargaMaha("WNI");


        binding.JKPerempuan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    classA.setJenisKelamin("Perempuan");
                }
            }
        });

        binding.JKLaki.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    classA.setJenisKelamin("Laki - Laki");
                }
            }
        });

        binding.BelumNikah.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    classA.setStatusMaha("Belum Menikah");
                }
            }
        });

        binding.Menikah.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    classA.setStatusMaha("Menikah");
                }
            }
        });
        binding.Biagrawan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    classA.setStatusMaha("Biagrawan");
                }
            }
        });

        binding.Wna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    classA.setKewargaMaha("WNA");
                }
            }
        });
        binding.AkreditasiDenganNilai.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    classA.setKewargaMaha("WNI");
                }
            }
        });
        binding.AkreditasiDenganNilai.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    classA.setStatusMahaTrans("Akreditasi dengan nilai ?");
                }
            }
        });
        binding.BlmAkreditasi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    classA.setStatusMahaTrans("Belum Terakreditasi");

            }
        });


            binding.Next1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    classA.setNamaLengkap(binding.IsiNamaLengkapMaha.getText().toString());
                    classA.setAgamaMaha(binding.spinnerAgama.getSelectedItem().toString());
                    classA.setAlamatSurat(binding.IsiAlamatSurat.getText().toString());
                    classA.setAlamatAsal(binding.IsiAlamatAsal.getText().toString());
                    classA.setKabupaten(binding.IsiKabupatenKota.getText().toString());
                    classA.setProvinsi(binding.IsiProvinsi.getText().toString());
                    classA.setNoRumah(binding.IsiNomorRumah.getText().toString());
                    classA.setNoHp(binding.IsiNomorHp.getText().toString());
                    classA.setAlamatEmail(binding.IsiAlamatEmail.getText().toString());
                    classA.setNamaOrtu(binding.IsiNamaOrtu.getText().toString());
                    classA.setPendidikanOrtu(binding.spinnerPendidikanOrtu.getSelectedItem().toString());
                    classA.setAsalUniv(binding.IsiAsalUniv.getText().toString());
                    classA.setAsalProdi(binding.IsiAsalProdi.getText().toString());


                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    // put mahasiswa object to extra
                    intent.putExtra("MAHASISWA1", classA);

                    startActivity(intent);
                }
            });

        btn = findViewById(R.id.Lanjut1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivityB.class);
                // put mahasiswa object to extra
                intent.putExtra("MAHASISWA1", classA);
                startActivity(intent);
            }
        });
    }
}