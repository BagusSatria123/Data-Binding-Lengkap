package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

import com.bagus.databinding.databinding.ActivityMainEBinding;
import com.bagus.databinding.models.ClassA;
import com.bagus.databinding.models.ClassB;
import com.bagus.databinding.models.ClassC;
import com.bagus.databinding.models.ClassD;
import com.bagus.databinding.models.ClassE;

import static androidx.databinding.library.baseAdapters.BR.classB;
import static androidx.databinding.library.baseAdapters.BR.classC;
import static androidx.databinding.library.baseAdapters.BR.classD;
import static com.bagus.databinding.BR.classA;

public class MainActivityE extends AppCompatActivity {
    ClassE classE;
    ClassD classD;
    ClassC classC;
    ClassA classA;
    ClassB classB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainEBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main_e);
        classE = new ClassE();
        classA = getIntent().getExtras().getParcelable("MAHASISWA1");
        classB = getIntent().getExtras().getParcelable("PilihanPoltek1");
        classC = getIntent().getExtras().getParcelable("SekolahMenengah1");
        classD = getIntent().getExtras().getParcelable("Beasiswa4");


        classE.setSuratMiskin("Surat keterangan miskin dari desa/kelurahan");
        classE.setSuratGajiOrtu("Surat keterangan gaji orang tua atau surat pernyataan yang mencantumkan rata rata pendapatan selama 6 bulan terakhir");
        classE.setFcListrik("Foto copy tagihan listrik, air");
        classE.setPrestasi("Bukti bukti prestasi yang dicantumkan dalam bentuk sertifikat");
        classE.setIjazah("Ijasah dan transkrip nilai ");
        classE.setRekom("Rekomendasi dari sekolah");
        classE.setFcRaport("Foto copy raport dari semester 1");

        binding.SuratMiskin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    classE.setSuratMiskin("Surat keterangan miskin dari desa/kelurahan");
                }
            }
        });

        binding.SuratGaji.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    classE.setSuratGajiOrtu("Surat keterangan gaji orang tua atau surat pernyataan yang mencantumkan rata rata pendapatan selama 6 bulan terakhir");
                }
            }
        });

        binding.FotoCopy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    classE.setFcListrik("Foto copy tagihan listrik, air");
                }
            }
        });

        binding.prestasi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    classE.setPrestasi("Bukti bukti prestasi yang dicantumkan dalam bentuk sertifikat");
                }
            }
        });
        binding.Ijazah.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    classE.setIjazah("Ijasah dan transkrip nilai ");
                }
            }
        });

        binding.Rekomendasi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    classE.setRekom("Rekomendasi dari sekolah");
                }
            }
        });
        binding.FcRaport.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    classE.setFcRaport("Foto copy raport dari semester 1");
                }
            }
        });
        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),DetailActivity5.class);
                // put mahasiswa object to extra
                intent.putExtra("Centang5",classE);

                startActivity(intent);
            }
        });
        binding.LihatSeluruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),DetailActivityAll.class);
                // put mahasiswa object to extra
                intent.putExtra("MAHASISWA2",classA);
                intent.putExtra("PilihanPoltek2",classB);
                intent.putExtra("SekolahMenengah2",classC);
                intent.putExtra("Beasiswa2",classD);
                intent.putExtra("Centang5",classE);

                startActivity(intent);
            }
        });
    }
}