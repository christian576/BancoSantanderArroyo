package com.company;

public class CuentaCorriente extends Cuenta {

    private double  montoAutorizado;
    private double saldoAFavor;

    public CuentaCorriente(Cliente titular, double depositarCheque) {
        super(titular);

        this.montoAutorizado = 2000;
    }
    public void depositarCheque (Cheque cheque){
        setSaldo(getSaldo() + cheque.getMonto());
    }
    public void extraer (double monto){
        if(monto<= getSaldo() + montoAutorizado){
            saldoAFavor = saldoAFavor - monto - montoAutorizado;
            super.extraer(monto);
            System.out.println("el saldo es superior al autorizado");
        }
    }
}
