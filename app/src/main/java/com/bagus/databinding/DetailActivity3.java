package com.bagus.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bagus.databinding.databinding.ActivityDetail2Binding;
import com.bagus.databinding.databinding.ActivityDetail3Binding;
import com.bagus.databinding.models.ClassB;
import com.bagus.databinding.models.ClassC;

import java.util.Objects;

public class DetailActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetail3Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_detail3);

        ClassC classC = Objects.requireNonNull(getIntent().getExtras()).getParcelable("SekolahMenengah1");
        binding.setClassC(classC);
    }
}