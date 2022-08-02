package br.edu.ifsul.exercicio3.model;

public class DevPleno extends Desenvolvedor {
    @Override
    public double getBonus() {
        double salarioBonus;
        salarioBonus = super.getSalario() + (super.getSalario() * 5/100);
        return salarioBonus;
    }

    public DevPleno(int id, String nome, double salario) {
        super(id, nome, salario);
    }
}
