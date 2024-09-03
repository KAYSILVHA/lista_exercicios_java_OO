package encapsulamento.ex_1;

public class SistemaPagamento {

    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito();
        FormaPagamento boleto = new Boleto();
        FormaPagamento pix = new Pix();

        cartao.processarPagamento(250.00);
        boleto.processarPagamento(500.00);
        pix.processarPagamento(750.00);
    }
}
