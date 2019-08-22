package com.company;

public class CuentaConvertibilidad extends CuentaCorriente {

    private double saldoAFavorDolares;
    private double SaldoAFavorPesos;

    public CuentaConvertibilidad(Cliente titular, double depositarCheque){
        super(Cuenta);

    }
    public void depositarChequeDolares (Cheque cheque, tipoDeCambio cambio) {setSaldo(getSaldo() + (saldoAFavorDolares= cheque.getMonto()*cambio.getImporte()));}
    public void venderDolares (double monto, tipoDeCambio cambio){
        if(monto< saldoAFavorDolares){
            System.out.println("Saldo insuficiente para realizar la transaccion");
        } else {
            SaldoAFavorPesos = SaldoAFavorPesos + (monto*cambio.getImporte());
            System.out.println(SaldoAFavorPesos);
        }
    }

}
