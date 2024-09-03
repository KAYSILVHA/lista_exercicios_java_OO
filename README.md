<h1 align="center"> LISTA DE EXERCÍCIOS SOBRE JAVA OO </h1>

<p align="center">
Lista de exercícios sobre Orientação a Objetos em Java proposta pela formação Fullstack oferecida pela <a href="https://www.codificaedu.com.br/" target="_blank">Codifica Edu</a> e <a href="https://www.maisprati.com.br/" target="_blank">+praTI<a/>.
</p>
<br>
<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-estrutura">Estrutura do código</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-executar">Como executar localmente</a>&nbsp;&nbsp;&nbsp;
</p>
<br>

<p align="center">
  <img alt="Curso Fullstack" src="https://miro.medium.com/v2/resize:fit:900/1*8CM8xyu2U-fs8mS_adV0lg.jpeg" width="60%">
</p>
<br>

## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- Git
- GitHub
- Java


## 📝 Estrutura

```
  lista_exercicios_java_OO/
│
├── abstracao/
|   └── ex_1/
|   |   └── Produto.java
|   |
|   └── ex_2/
|       └── Produto.java
|   
|
├── encapsulamento/
|   └── ex_1/
|   |   ├── Boleto.java
|   |   ├── CartaoCredito.java
|   |   ├── FormaPagamento.java
|   |   ├── Pix.java
|   |   └── SistemaPagamento.java
|   |
|   └── ex_2/
|       ├── Desenvolvedor.java
|       ├── Estagiario.java
|       ├── Funcionario.java
|       ├── Gerente.java
|       └── SistemaGestaoFuncionarios.java
|   
├── heranca/
|   └── ex_1/
|   |   ├── Desenvolvedor.java
|   |   ├── Funcionario.java
|   |   ├── Gerente.java
|   |   └── Main.java
|   |
|   └── ex_2/
|       ├── Desenvolvedor.java
|       ├── Funcionario.java
|       ├── Gerente.java
|       └── Main.java
|   
├── polimorfismo/
|   └── ex_1/
|   |   ├── Bicicleta.java
|   |   ├── Carro.java
|   |   ├── IMeioTransporte.java
|   |   ├── Main.java
|   |   └── Trem.java
|   |
|   └── ex_2/
|       ├── Animal.java
|       ├── Cachorro.java
|       ├── Gato.java
|       ├── Main.java
|       └── Vaca.java
|   
├── README.md


```
<br>

# 🚀 Projetos

## 🟢Encapsulamento
### Exercício 1 - Criação de uma Classe Simples

Objetivo: Crie uma classe Produto que represente um produto de uma
loja. A classe deve ter atributos privados nome, preco e quantidade em
estoque. Implemente métodos públicos para acessar e modificar esses
atributos. Garanta que o preço e a quantidade não possam ser negativos.

</p>

<p>
<strong>RESPOSTA: <a href="./abstracao/ex_1">CLIQUE AQUI!</a></strong>
</p>


<hr>
<br>

### Exercício 2 - Melhorando a Classe com Validação

Objetivo: Extenda a classe Produto para incluir um método
aplicarDesconto(double porcentagem) que reduz o preço do produto.
Valide para garantir que o desconto não possa ser maior que 50%.
Implemente a lógica que lança uma exceção se o desconto for inválido.

</p>

<p>
<strong>RESPOSTA: <a href="./abstracao/ex_2">CLIQUE AQUI!</a></strong>
</p>


<hr>
<br>

## 🟢Herança
### Exercício 1 - Criação de uma Hierarquia de Classes

Objetivo: Crie uma classe Funcionario com atributos nome e salario. Em
seguida, crie duas subclasses: Gerente e Desenvolvedor. Adicione um
método calcularBonus que retorna um valor diferente para cada tipo de
funcionário (por exemplo, 20% do salário para Gerente e 10% para
Desenvolvedor). Utilize protected para permitir que as subclasses
acessem os atributos da classe base de forma segura.

</p>

<p>
<strong>RESPOSTA: <a href="./heranca/ex_1">CLIQUE AQUI!</a></strong>
</p>


<hr>
<br>

### Exercício 2 - Sobrescrita de Métodos

Objetivo: Na classe Funcionario, crie um método trabalhar(), que
imprime uma mensagem genérica sobre o trabalho realizado. Nas
subclasses Gerente e Desenvolvedor, sobrescreva esse método para
especificar o tipo de trabalho realizado por cada um. Utilize a anotação
@Override e explore como ela ajuda a garantir que a sobrescrita foi feita
corretamente.

</p>

<p>
<strong>RESPOSTA: <a href="./heranca/ex_2">CLIQUE AQUI!</a></strong>
</p>


<hr>
<br>

## 🟢Polimorfismo
### Exercício 1 - Polimorfismo com Interfaces

Objetivo: Crie uma interface IMeioTransporte com métodos acelerar() e
frear(). Implemente essa interface em classes Carro, Bicicleta e Trem.
No método principal, crie um array de IMeioTransporte e percorra-o
chamando acelerar() e frear() para cada objeto. Utilize polimorfismo
para que cada tipo de transporte implemente acelerar() e frear() de
maneira diferente.

</p>

<p>
<strong>RESPOSTA: <a href="./polimorfismo/ex_1">CLIQUE AQUI!</a></strong>
</p>


<hr>
<br>

### Exercício 2 - Polimorfismo com Classes Abstratas

Objetivo: Crie uma classe abstrata Animal com um método abstrato
emitirSom(). Crie subclasses Cachorro, Gato e Vaca, cada uma
implementando emitirSom() de maneira específica. Crie uma lista de
Animal no método principal e adicione instâncias de cada subclasse. Itere
sobre a lista e invoque o método emitirSom() para cada animal,
demonstrando o polimorfismo.

</p>

<p>
<strong>RESPOSTA: <a href="./polimorfismo/ex_2">CLIQUE AQUI!</a></strong>
</p>


<hr>
<br>

## 🟢Abstração
### Exercício 1 - Abstração em um Sistema de Pagamentos

Objetivo: Crie uma classe abstrata FormaPagamento com métodos
abstratos processarPagamento(double valor) e validarPagamento().
Crie classes concretas CartaoCredito, Boleto e Pix que herdam de
FormaPagamento e implementam os métodos abstratos. Adicione lógica de
validação específica para cada forma de pagamento e simule um sistema
que utilize diferentes formas de pagamento.

</p>

<p>
<strong>RESPOSTA: <a href="./abstracao/ex_1">CLIQUE AQUI!</a></strong>
</p>


<hr>
<br>

### Exercício 2 - Sistema de Gestão de Funcionários

Objetivo: Crie um sistema que gerencie diferentes tipos de funcionários
(Gerente, Desenvolvedor, Estagiario). Cada tipo de funcionário deve ter
uma maneira diferente de calcular o salário e o bônus. Utilize uma
combinação de herança, polimorfismo e encapsulamento para estruturar
as classes. Implemente um método calcularFolhaPagamento que itera
sobre todos os funcionários e calcula o total de salários e bônus. Adicione
novas funcionalidades, como a possibilidade de promover um funcionário,
o que altera seu tipo e os cálculos de salário e bônus.

</p>

<p>
<strong>RESPOSTA: <a href="./abstracao/ex_2">CLIQUE AQUI!</a></strong>
</p>

<hr>
<br>
<br>

## 🚀 Executar
Siga os passos abaixo para configurar e executar o projeto localmente em sua máquina:
## Pré-requisitos

Antes de executar o projeto, você precisa ter o seguinte software instalado:

- [Java Development Kit (JDK) 8 ou superior](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- Um IDE de sua preferência (recomendado: [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/))

## Como Executar os Exercícios

1. **Clone o repositório:**

   ```bash
   git clone hhttps://github.com/KAYSILVHA/lista_exercicios_java_OO.git
   cd lista_exercicios_java_OO
   ```
   
2. Abra o projeto na sua IDE:

  - Se estiver usando IntelliJ IDEA ou Eclipse, você pode abrir o diretório LISTA_EXERCICIOS_JAVA_ED diretamente como um projeto.
    Navegue até o exercício que você deseja executar.


Basta navegar até a pasta correspondente ao exercício que deseja executar e seguir o mesmo procedimento.
