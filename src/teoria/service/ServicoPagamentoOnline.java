package teoria.service;

import teoria.model.Cartao;
import teoria.model.Estabelecimento;
import teoria.model.Recibo;

public class ServicoPagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {

        if (cartao.saldo < valor) {
            throw new RuntimeException(
                    "Saldo insuficiente para pagamento"
            );
        }

        cartao.saldo -= valor;

        return new Recibo(cartao.titular, "Pagemento", valor);
    }
}
