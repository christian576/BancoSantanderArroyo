package com.company;

public class ClienteEmpresa extends Cliente {

    private String nombrefantasia;

    public ClienteEmpresa(String nombre, String apellido, Integer nroCliente, Integer dni, String cuit, String nombrefantasia) {
        super(nombre, apellido, nroCliente, dni, cuit);
        this.nombrefantasia = nombrefantasia;
    }
}
