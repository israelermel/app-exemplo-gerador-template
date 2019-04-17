package com.israelermel.templateteste;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.israelermel.templateteste.databinding.MainBinding;
import com.israelermel.templateteste.ui.cliente.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setVm(new MainViewModel());

        binding.executePendingBindings();
    }
}
