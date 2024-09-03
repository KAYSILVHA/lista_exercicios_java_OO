package encapsulamento.ex_2;

public abstract class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public double calcularSalarioTotal() {
        return salario + calcularBonus();
    }
}