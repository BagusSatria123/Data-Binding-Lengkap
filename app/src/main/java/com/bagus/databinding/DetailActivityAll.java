package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;


import com.bagus.databinding.databinding.ActivityDetailAllBinding;
import com.bagus.databinding.models.ClassA;
import com.bagus.databinding.models.ClassB;
import com.bagus.databinding.models.ClassC;
import com.bagus.databinding.models.ClassD;
import com.bagus.databinding.models.ClassE;

import java.util.Objects;

public class DetailActivityAll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailAllBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_all);
        ClassA classA = Objects.requireNonNull(getIntent().getExtras()).getParcelable("MAHASISWA2");
        binding.setClassA(classA);
        ClassB classB = Objects.requireNonNull(getIntent().getExtras()).getParcelable("PilihanPoltek2");
        binding.setClassB(classB);
        ClassC classC = Objects.requireNonNull(getIntent().getExtras()).getParcelable("SekolahMenengah2");
        binding.setClassC(classC);
        ClassD classD = Objects.requireNonNull(getIntent().getExtras()).getParcelable("Beasiswa2");
        binding.setClassD(classD);
        ClassE classE = Objects.requireNonNull(getIntent().getExtras()).getParcelable("Centang5");
        binding.setClassE(classE);
    }
}