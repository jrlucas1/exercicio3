package br.edu.ifsul.exercicio3.model;

public interface Investidor {
    String getTicker();
    void setTicker(String ticker);
    int getQuantidade();
    void  setQuantidade(int quantidade);
}
