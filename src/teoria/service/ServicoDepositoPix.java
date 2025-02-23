package teoria.service;

import teoria.model.Cartao;
import teoria.model.Recibo;

public class ServicoDepositoPix {
    //TODO faz combranças do pagamento via Pix;

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.obterTitular(), "Deposito", valorDeposito);
    }
}
