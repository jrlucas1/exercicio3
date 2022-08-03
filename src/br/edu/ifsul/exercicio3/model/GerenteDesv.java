package br.edu.ifsul.exercicio3.model;

public class GerenteDesv extends Gerente {
    private int quantidade;
    private String ticker;

    @Override
    public double getBonus() {
        double salarioBonus;
        salarioBonus = super.getSalario() + (super.getSalario() * 20/100);
        return salarioBonus;
    }
    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }
    public GerenteDesv(int id, String nome, double salario) {
        super(id, nome, salario);
    }
}
