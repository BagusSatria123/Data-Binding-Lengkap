package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bagus.databinding.databinding.ActivityMainDBinding;

import com.bagus.databinding.models.ClassA;
import com.bagus.databinding.models.ClassB;
import com.bagus.databinding.models.ClassC;
import com.bagus.databinding.models.ClassD;

public class MainActivityD extends AppCompatActivity {
    ClassD classD;
    ClassC classC;
    ClassA classA;
    ClassB classB;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainDBinding binding4 = DataBindingUtil.setContentView(this,R.layout.activity_main_d);
        classD = new ClassD();
        classA = getIntent().getExtras().getParcelable("MAHASISWA1");
        classB = getIntent().getExtras().getParcelable("PilihanPoltek1");
        classC = getIntent().getExtras().getParcelable("SekolahMenengah1");


        binding4.Next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                classD.setHargaBeasiswa(binding4.isiBeasiswaD.getText().toString());

                Intent intent = new Intent(getApplicationContext(),DetailActivity4.class);

                intent.putExtra("Beasiswa4",classD);
                startActivity(intent);
            }
        });

        btn = findViewById(R.id.Lanjut4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivityE.class);
                intent.putExtra("MAHASISWA1", classA);
                intent.putExtra("PilihanPoltek1",classB);
                intent.putExtra("SekolahMenengah1",classC);
                intent.putExtra("Beasiswa4",classD);

                startActivity(intent);
            }
        });
    }
}