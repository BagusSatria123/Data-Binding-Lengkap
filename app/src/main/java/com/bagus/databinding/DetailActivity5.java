package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bagus.databinding.databinding.ActivityDetail5Binding;
import com.bagus.databinding.models.ClassE;

import java.util.Objects;

public class DetailActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetail5Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_detail5);

        ClassE classE = Objects.requireNonNull(getIntent().getExtras()).getParcelable("Centang5");
        binding.setClassE(classE);
    }
}