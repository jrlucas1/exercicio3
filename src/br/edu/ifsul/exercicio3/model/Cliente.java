package br.edu.ifsul.exercicio3.model;

public class Cliente implements Investidor {
    private int id;
    private String nome;
    private String sobrenome;
    private int quantidade;
    private String ticker;

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }
}
