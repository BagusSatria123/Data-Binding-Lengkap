package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bagus.databinding.databinding.ActivityDetail4Binding;
import com.bagus.databinding.models.ClassD;

import java.util.Objects;

public class DetailActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetail4Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_detail4);

        ClassD classD = Objects.requireNonNull(getIntent().getExtras()).getParcelable("Beasiswa4");
        binding.setClassD(classD);
    }
}