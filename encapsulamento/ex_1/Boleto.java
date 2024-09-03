package encapsulamento.ex_1;

public class Boleto extends FormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " processado com Boleto.");
        } else {
            System.out.println("Falha na validação do Boleto. Pagamento não processado.");
        }
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando Boleto...");
        return true;
    }
}