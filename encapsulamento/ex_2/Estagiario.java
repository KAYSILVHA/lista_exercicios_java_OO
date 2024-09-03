package encapsulamento.ex_2;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }
}

