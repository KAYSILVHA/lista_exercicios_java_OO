package heranca.ex_2;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está escrevendo código.");
    }
}
