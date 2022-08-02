package br.edu.ifsul.exercicio3.model;

public class GerenteDesv extends Gerente {
    @Override
    public double getBonus() {
        double salarioBonus;
        salarioBonus = super.getSalario() + (super.getSalario() * 20/100);
        return salarioBonus;
    }
    @Override
    public String getTicker() {
        return null;
    }

    @Override
    public String setTicker(String ticker) {
        return null;
    }

    @Override
    public int setQuantidade(int quantidade) {
        return 0;
    }

    @Override
    public int getQuantidade() {
        return 0;
    }
    public GerenteDesv(int id, String nome, double salario) {
        super(id, nome, salario);
    }
}
