package br.edu.ifsul.exercicio3.model;

public class GerenteGeral extends Gerente {

    @Override
    public double getBonus() {
        double salarioBonus;
        salarioBonus = super.getSalario() + (super.getSalario() * 40/100);
        return salarioBonus;
    }

    public GerenteGeral(int id, String nome, double salario) {
        super(id, nome, salario);
    }
}
