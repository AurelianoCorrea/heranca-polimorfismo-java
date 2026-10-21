/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;


import controle.ControleDeBonificacoes;
import model.Diretor;
import model.Estagiario;
import model.Gerente;
import model.Programador;

public class ProgramaFuncionario {

    public static void main(String[] args) {

        Programador p =
                new Programador(
                        "Aureliano",
                        "233.233.233.23",
                        5000,
                        "Java"
                );

        Estagiario e =
                new Estagiario(
                        "Daniel",
                        "345.345.345.45",
                        2000,
                        "CEFET-MG"
                );

        Gerente g =
                new Gerente(
                        "MIchelli",
                        "566.566.566.67",
                        6500,
                        1234
                );

        Diretor d =
                new Diretor(
                        "Relison",
                        "788.788.788.65",
                        10000,
                        4321
                );

        ControleDeBonificacoes controle =
                new ControleDeBonificacoes();

        controle.registra(p);
        controle.registra(e);
        controle.registra(g);
        controle.registra(d);

        p.exibirDados();
        e.exibirDados();
        g.exibirDados();
        d.exibirDados();

        System.out.println("-----------");
        System.out.println(
                "Total de bonificações: R$ "
                + controle.getTotalBonificacoes()
        );
    }
}
