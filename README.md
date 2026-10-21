Funcionários da Empresa – Herança, Polimorfismo e Classes Abstratas
Descrição
Projeto desenvolvido em Java para demonstrar os conceitos de Programação Orientada a Objetos (POO), utilizando:

Herança
Polimorfismo
Classes Abstratas
Encapsulamento
Sobrescrita de Métodos
O sistema realiza o cadastro de funcionários de diferentes cargos e calcula automaticamente suas bonificações de acordo com as regras de cada função.

Hierarquia de Classes
Funcionario (abstract)
 ├── Programador
 ├── Estagiario
 └── Gerente
      └── Diretor
Regras de Bonificação
Cargo	Bonificação
Programador	10% do salário
Estagiário	R$ 200,00
Gerente	15% do salário
Diretor	Bonificação do Gerente + R$ 1.000,00
Estrutura do Projeto
src
│
├── app
│   └── ProgramaFuncionario.java
│
├── controle
│   └── ControleDeBonificacao.java
│
└── model
    ├── Funcionario.java
    ├── Programador.java
    ├── Estagiario.java
    ├── Gerente.java
    └── Diretor.java
Tecnologias Utilizadas
Java
NetBeans
Git
GitHub
Perguntas e Respostas
1. O que significa dizer que “todo Diretor é um Gerente” e que “todo Gerente é um Funcionario”?
Significa que existe uma relação de herança entre as classes.

Diretor extends Gerente
Gerente extends Funcionario
O Diretor herda todos os atributos e métodos do Gerente, e o Gerente herda tudo do Funcionario. Dessa forma, um objeto Diretor pode ser utilizado em qualquer lugar onde se espera um Gerente ou um Funcionario.

2. Qual é a diferença entre super(...) e super.getBonificacao()?
O comando super(...) é utilizado para chamar o construtor da classe mãe.

super(nome, cpf, salario, senha);
Já super.getBonificacao() é utilizado para executar um método da classe mãe.

return super.getBonificacao() + 1000;
Na classe Diretor, ele reaproveita o cálculo da bonificação do Gerente e acrescenta R$ 1.000,00 ao valor final.

3. O método registra() da classe ControleDeBonificacao recebe um Funcionario. Como ele sabe qual regra de bonificação usar? Isso é decidido na compilação ou na execução?
Isso acontece por meio do polimorfismo.

Mesmo recebendo um objeto do tipo Funcionario, o Java identifica o tipo real do objeto em tempo de execução.

public void registra(Funcionario funcionario)
Ao chamar:

funcionario.getBonificacao();
o sistema executa o método correspondente ao objeto real (Programador, Estagiario, Gerente ou Diretor).

4. Se a empresa criar um novo cargo (por exemplo, Analista), será necessário alterar a classe ControleDeBonificacao? Por quê?
Não.

Basta criar uma nova classe herdando de Funcionario e implementar os métodos obrigatórios.

public class Analista extends Funcionario {
    ...
}
A classe ControleDeBonificacao continuará funcionando normalmente, pois trabalha com o tipo genérico Funcionario.

5. Por que não é possível instanciar uma classe abstrata? Então, para que ela serve?
Não é possível instanciar uma classe abstrata porque ela representa um conceito genérico e incompleto.

Por exemplo:

Funcionario f = new Funcionario();
Esse código gera erro de compilação.

A classe abstrata serve para:

Centralizar atributos e métodos comuns.
Evitar repetição de código.
Servir como modelo para as subclasses.
Obrigar as classes filhas a implementarem métodos específicos.
Permitir o uso do polimorfismo.
No projeto, a classe Funcionario fornece a base para todos os cargos da empresa.

Autor
Aureliano Corrêa

Projeto desenvolvido para estudo e prática dos conceitos de Programação Orientada a Objetos em Java.
