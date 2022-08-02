package br.edu.ifsul.exercicio3.model;

public class GerenteDesv extends Gerente {
    @Override
    public double getBonus() {
        double salarioBonus;
        salarioBonus = super.getSalario() + (super.getSalario() * 20/100);
        return salarioBonus;
    }

    public GerenteDesv(int id, String nome, double salario) {
        super(id, nome, salario);
    }
}