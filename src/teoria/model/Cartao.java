package teoria.model;

import java.io.Serializable;

public class Cartao implements Serializable {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50.0;

    private String titular;
    private double saldo;

    public Cartao() {
    }

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void debitar(double valor) {

        if (getSaldo() < valor) {
            throw new RuntimeException(
                    "Saldo insuficiente para pagamento"
            );
        }

        saldo -= valor;
    }

    public void depositar(double valor) {

        if (valor < Cartao.VALOR_MINIMO_DEPOSITO)  {
            throw new IllegalArgumentException(
                    String.format("O valor de deposito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO)
            );
        }

        saldo += valor - Cartao.TARIFA_DEPOSITO;
    }
}
