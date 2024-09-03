package encapsulamento.ex_2;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoFuncionarios {
    private List<Funcionario> funcionarios;

    public SistemaGestaoFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalarioTotal();
        }
        return total;
    }

    public void promoverFuncionario(Funcionario funcionario, Funcionario novoCargo) {
        int index = funcionarios.indexOf(funcionario);
        if (index != -1) {
            funcionarios.set(index, novoCargo);
            System.out.println(funcionario.getNome() + " foi promovido para " + novoCargo.getClass().getSimpleName() + ".");
        }
    }

    public static void main(String[] args) {
        SistemaGestaoFuncionarios sistema = new SistemaGestaoFuncionarios();

        Funcionario gerente = new Gerente("Carlos", 10000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 8000);
        Funcionario estagiario = new Estagiario("Pedro", 3000);

        sistema.adicionarFuncionario(gerente);
        sistema.adicionarFuncionario(desenvolvedor);
        sistema.adicionarFuncionario(estagiario);

        double folhaTotal = sistema.calcularFolhaPagamento();
        System.out.println("Folha de pagamento total: R$ " + folhaTotal);

        Funcionario novoDesenvolvedor = new Desenvolvedor(estagiario.getNome(), 5000);
        sistema.promoverFuncionario(estagiario, novoDesenvolvedor);

        folhaTotal = sistema.calcularFolhaPagamento();
        System.out.println("Folha de pagamento total após promoção: R$ " + folhaTotal);
    }
}
