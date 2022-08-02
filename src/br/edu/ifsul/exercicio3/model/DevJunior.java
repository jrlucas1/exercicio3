package br.edu.ifsul.exercicio3.model;

public class DevJunior extends Desenvolvedor {
    @Override
    public double getBonus() {
        double salarioBonus;
        salarioBonus = super.getSalario() + (super.getSalario() * 5/100);
        return salarioBonus;
    }
}
