package com.israelermel.templateteste.model.cliente;

import com.israelermel.templateteste.model.Cliente;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Criado por israelermel, data 11/04/19
 */
public interface ClienteService {

    @GET("cliente")
    Call<List<Cliente>> loadClientes();

}
