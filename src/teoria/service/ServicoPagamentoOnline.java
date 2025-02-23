package teoria.service;

import teoria.model.Cartao;
import teoria.model.Estabelecimento;
import teoria.model.Recibo;

public class ServicoPagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {

        cartao.debitar(valor);

        return new Recibo(cartao.obterTitular(), "Pagemento", valor);
    }
}
