package encapsulamento.ex_1;

public class CartaoCredito extends FormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " processado com Cartão de Crédito.");
        } else {
            System.out.println("Falha na validação do Cartão de Crédito. Pagamento não processado.");
        }
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando Cartão de Crédito...");
        return true;
    }
}