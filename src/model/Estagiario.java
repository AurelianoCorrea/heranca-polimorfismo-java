/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Estagiario extends Funcionario {

    private final String instituicao;

    public Estagiario(String nome, String cpf,
                      double salario, String instituicao) {

        super(nome, cpf, salario);
        this.instituicao = instituicao;
    }

    @Override
    public double getBonificacao() {
        return 200.0;
    }

    @Override
    public String getCargo() {
        return "Estagiário";
    }

    public String getInstituicao() {
        return instituicao;
    }
}


