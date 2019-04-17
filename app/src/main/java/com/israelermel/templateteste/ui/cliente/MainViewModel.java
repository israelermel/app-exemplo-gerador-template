package com.israelermel.templateteste.ui.cliente;

import android.util.Log;

/**
 * Criado por israelermel, data 14/04/19
 */
public class MainViewModel {

    public MainView v = new MainView();

    public void onSalvar() {

        Log.d("israel", v.toString());

    }

}
