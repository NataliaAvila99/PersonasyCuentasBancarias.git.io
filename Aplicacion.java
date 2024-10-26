import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Satoru Gojo", 30);
        Persona persona2 = new Persona("Hinata Hyuga", 18);
        Persona persona3 = new Persona("Eren Yeager", 60);


        CuentaBancaria cuenta1 = new CuentaBancaria(900.00, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(700.00, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(4600.00, persona3);

        cuenta1.depositar(500);
        cuenta2.retirar(200);
        cuenta3.depositar(1000);
        cuenta3.retirar(500);

        System.out.println("Saldo de la cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Saldo de la cuenta 2: " + cuenta2.getSaldo());
        System.out.println("Saldo de la cuenta 3: " + cuenta3.getSaldo());

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}