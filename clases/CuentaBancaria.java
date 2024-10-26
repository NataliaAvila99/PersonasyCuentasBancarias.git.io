package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();


    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = generarNumeroCuenta();
        listaDeCuentasBancarias.add(this);
    }


    private int generarNumeroCuenta() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }


    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito de " + monto + " realizado con exito.");
        } else {
            System.out.println("Monto invalido para depositar.");
        }
    }


    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado con exito.");
        } else {
            System.out.println("Fondos insuficientes o monto invalido.");
        }
    }


    public void despliegaInformacion() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        titular.despliegaInformacion();
    }


    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("Informacion de todas las cuentas:");
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
            System.out.println();
        }
    }
}