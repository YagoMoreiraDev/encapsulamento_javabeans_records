package teoria.service;

import teoria.model.Cartao;
import teoria.model.Recibo;

public class ServicoDepositoPix {
    //TODO faz combranças do pagamento via Pix;

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO)  {
            throw new IllegalArgumentException(
                    String.format("O valor de deposito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO)
            );
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Deposito", valorDeposito);
    }
}
