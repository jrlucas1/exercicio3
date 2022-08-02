package br.edu.ifsul.exercicio3.model;

public interface Investidor {
    String getTicker();
    String setTicker(String ticker);
    int getQuantidade();
    int setQuantidade(int quantidade);
}
