package encapsulamento.ex_1;

public abstract class FormaPagamento {
    public abstract void processarPagamento(double valor);

    public abstract boolean validarPagamento();
}
