package br.edu.ifsul.exercicio3.model;

public class DevSenior extends Desenvolvedor{
    @Override
    public double getBonus() {
        double salarioBonus;
        salarioBonus = super.getSalario() + (super.getSalario() * 10/100);
        return salarioBonus;
    }

    public DevSenior(int id, String nome, double salario) {
        super(id, nome, salario);
    }
}
