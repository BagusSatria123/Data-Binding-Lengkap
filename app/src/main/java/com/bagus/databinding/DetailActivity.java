package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bagus.databinding.databinding.ActivityDetailBinding;
import com.bagus.databinding.models.ClassA;
import com.bagus.databinding.models.ClassB;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_detail);
        ClassA classA = Objects.requireNonNull(getIntent().getExtras()).getParcelable("MAHASISWA1");
        binding.setClassA(classA);

    }
}