package br.edu.ifsul.exercicio3.model;

public class GerenteGeral extends Gerente{

    @Override
    public double getBonus() {
        double salarioBonus;
        salarioBonus = super.getSalario() + (super.getSalario() * 40/100);
        return salarioBonus;
    }

    public GerenteGeral(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public String getTicker() {
        return null; // to do
    }

    @Override
    public String setTicker(String ticker) {
        return null; // to do
    }

    @Override
    public int setQuantidade(int quantidade) {
        return 0; // to do
    }

    @Override
    public int getQuantidade() {
        return 0; // to do
    }
}
