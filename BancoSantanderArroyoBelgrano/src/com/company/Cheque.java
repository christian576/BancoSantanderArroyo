package com.company;

import java.util.Date;

public class Cheque {
    private double monto;
    private  String banco;
    private Date fechaCheque;

    public double getMonto() {
        return monto;
    }

    public Cheque(double monto, String banco, Date fechaCheque) {
        this.monto = monto;
        this.banco = banco;
        this.fechaCheque = fechaCheque;
    }
}
