package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

import com.bagus.databinding.databinding.ActivityMainBBinding;
import com.bagus.databinding.models.ClassA;
import com.bagus.databinding.models.ClassB;

public class MainActivityB extends AppCompatActivity {
    ClassB classB;
    ClassA classA;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        final ActivityMainBBinding binding2 = DataBindingUtil.setContentView(this,R.layout.activity_main_b);
        classB = new ClassB();
        classA = getIntent().getExtras().getParcelable("MAHASISWA1");
        classB.setPilihanPoliteknik("Pilihan 1");

        binding2.pilihan1DPM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    classB.setPilihanPoliteknik("Pilihan 1 Desain Produk Mekatronika");
                }
            }
        });

        binding2.pilihan2IM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    classB.setPilihanPoliteknik("Pilihan 2 Instrumentasi Medis");
                }
            }
        });
        binding2.Next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),DetailActivity2.class);
                // put mahasiswa object to extra
                intent.putExtra("PilihanPoltek1",classB);
//                intent.putExtra("MAHASISWA1",classA);

                startActivity(intent);
            }
        });

        btn = findViewById(R.id.Lanjut2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivityC.class);
                intent.putExtra("MAHASISWA1", classA);
                intent.putExtra("PilihanPoltek1",classB);
                startActivity(intent);
            }
        });
    }
}