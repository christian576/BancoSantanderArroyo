package com.company;

public class CajaAhorro extends Cuenta {
    private double tasaInteres = 1.2;

    public CajaAhorro(Cliente titular, double tasaInteres) {
        super(titular);
        this.tasaInteres = tasaInteres;

    }
    public void cobrarIntereses (){
        setSaldo(getSaldo()*tasaInteres);
    }
}
