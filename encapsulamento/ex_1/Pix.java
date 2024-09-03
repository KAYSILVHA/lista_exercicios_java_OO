package encapsulamento.ex_1;

public class Pix extends FormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + " processado com Pix.");
        } else {
            System.out.println("Falha na validação do Pix. Pagamento não processado.");
        }
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando Pix...");
        return true;
    }
}
