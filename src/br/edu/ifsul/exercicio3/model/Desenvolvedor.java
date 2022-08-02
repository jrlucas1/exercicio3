package br.edu.ifsul.exercicio3.model;

public abstract class Desenvolvedor extends Funcionario {
    public Desenvolvedor(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    public Desenvolvedor() {
        super();
    }

    @Override
    public abstract double getBonus();
}
