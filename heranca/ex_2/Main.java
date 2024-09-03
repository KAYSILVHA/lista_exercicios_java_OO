package heranca.ex_2;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Alice", 8000.00);
        gerente.trabalhar();

        Funcionario desenvolvedor = new Desenvolvedor("Bob", 5000.00);
        desenvolvedor.trabalhar();
    }
}
