package teoria;

import teoria.model.Cartao;
import teoria.model.Estabelecimento;
import teoria.model.Recibo;
import teoria.service.ServicoDepositoPix;
import teoria.service.ServicoPagamentoOnline;

public class Main {

    public static void main(String[] args) {

        var supermercado = new Estabelecimento("Mercantil Lago");
        var cartao = new Cartao("Yago Moreira");

        var servicoDeposito = new ServicoDepositoPix();
        Recibo recibo = servicoDeposito.efetuarDeposito(cartao, 500);
        recibo.imprimir();

        var servicoPagamento = new ServicoPagamentoOnline();
        recibo = servicoPagamento.efetuarPagamento(supermercado, cartao, 100);
        recibo.imprimir();

        System.out.printf("Titular: %s%n", cartao.obterTitular());
        System.out.printf("Saldo: R$ %.2f%n", cartao.obterSaldo());

    }

}
