package br.edu.ifsul.exercicio3.model;

public  abstract class Gerente extends Funcionario {
    public Gerente(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    public Gerente() {
    }

    @Override
    public abstract double getBonus();
}
