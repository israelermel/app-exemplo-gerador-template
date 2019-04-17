package com.israelermel.templateteste.ui.cliente;

import android.databinding.ObservableField;

/**
 * Criado por israelermel, data 14/04/19
 */
public class MainView {

    public final ObservableField<String> nome = new ObservableField<>();
    public final ObservableField<String> dataNascimento = new ObservableField<>();
    public final ObservableField<String> idade = new ObservableField<>();


    @Override
    public String toString() {
        return
                "nome:" + nome.get() +
                        "dataNascimento:" + dataNascimento.get() +
                        "idade:" + idade.get();
    }
}
