package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bagus.databinding.databinding.ActivityDetail2Binding;
import com.bagus.databinding.databinding.ActivityDetailBinding;
import com.bagus.databinding.models.ClassA;
import com.bagus.databinding.models.ClassB;

import java.util.Objects;

public class DetailActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetail2Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_detail2);

        ClassB classB = Objects.requireNonNull(getIntent().getExtras()).getParcelable("PilihanPoltek1");
        binding.setClassB(classB);
    }
}