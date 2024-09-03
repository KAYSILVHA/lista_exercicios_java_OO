package heranca.ex_1;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Alice", 8000.00);
        gerente.exibirInformacoes();

        Funcionario desenvolvedor = new Desenvolvedor("Bob", 5000.00);
        desenvolvedor.exibirInformacoes();
    }
}
