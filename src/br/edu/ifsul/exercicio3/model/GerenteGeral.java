package br.edu.ifsul.exercicio3.model;

public class GerenteGeral extends Gerente{
    private int quantidade;
    private String ticker;

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
}
