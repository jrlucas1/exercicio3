package br.edu.ifsul.exercicio3.controller;

import br.edu.ifsul.exercicio3.model.*;

import java.util.ArrayList;
import java.util.List;

public class funcionarioController {

    public static void main(String[] args) {


        GerenteGeral gg1 = new GerenteGeral(1, "Pedro de Oliveira", 6500);
        System.out.println(gg1);
        System.out.println(gg1.getBonus());

        GerenteDesv gd1 = new GerenteDesv(1, "Carlos Almeida", 4500);
        System.out.println(gd1);
        System.out.println(gd1.getBonus());

        DevSenior ds1 = new DevSenior(1, "Junior Alcantra", 3500);
        DevSenior ds2 = new DevSenior(2, "Tiago  Fernando", 3500);
        DevSenior ds3 = new DevSenior(3, "Paulo Alcantra", 3500);
        DevSenior ds4 = new DevSenior(4, "Carlos de Souza", 3500);
        DevSenior ds5 = new DevSenior(5, "Mauricio Arnaldo", 3500);
        DevSenior ds6 = new DevSenior(6, "Francisco da silva", 3500);
        System.out.println(ds1);
        System.out.println(ds1.getBonus());

        DevPleno dp1 = new DevPleno(1, "Joao da Silva", 2500);
        DevPleno dp2 = new DevPleno(2, "Joao da Silva", 2500);
        DevPleno dp3 = new DevPleno(3, "Joao da Silva", 2500);
        DevPleno dp4 = new DevPleno(4, "Joao da Silva", 2500);
        DevPleno dp5 = new DevPleno(5, "Joao da Silva", 2500);
        DevPleno dp6 = new DevPleno(6, "Joao da Silva", 2500);

        System.out.println(dp1);
        System.out.println(dp1.getBonus());


        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(gg1);
        funcionarios.add(gd1);

        funcionarios.add(ds1);
        funcionarios.add(ds2);
        funcionarios.add(ds3);
        funcionarios.add(ds4);
        funcionarios.add(ds5);
        funcionarios.add(ds6);


        funcionarios.add(dp1);
        funcionarios.add(dp2);
        funcionarios.add(dp3);
        funcionarios.add(dp4);
        funcionarios.add(dp5);
        funcionarios.add(dp6);




        for(Funcionario funcionario:funcionarios){
            funcionario.setSalario(funcionario.getSalario() + (funcionario.getSalario() * 5/100));
            System.out.println(funcionario);
        }
    }

}
