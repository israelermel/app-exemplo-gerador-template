package com.israelermel.templateteste.teste;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.israelermel.templateteste.R;
import com.israelermel.templateteste.databinding.PessoaBinding;

public class PessoaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PessoaBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_pessoa);
        binding.setVm(new PessoaViewModel());
        binding.executePendingBindings();

    }
}
