/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;



import model.Funcionario;

public class ControleDeBonificacoes {

    private double totalBonificacoes;

    public void registra(Funcionario funcionario) {
        totalBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalBonificacoes() {
        return totalBonificacoes;
    }
}
