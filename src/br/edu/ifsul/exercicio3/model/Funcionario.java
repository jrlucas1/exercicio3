package br.edu.ifsul.exercicio3.model;

public abstract class Funcionario {

    private int id;
    private String nome;
    private double salario;

    //getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double getBonus();



    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(int id, String nome, double salario){
        this.id = id;
        this.nome =  nome;
        this.salario = salario;
    }

    public Funcionario(){}


    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
