package entities;

public abstract class Funcionario {
    private final String nome;
    private final String cargo;
    private final Integer mes;
    private final Integer ano;

    public Funcionario(String nome, String cargo, Integer mes, Integer ano) {
        this.nome = nome;
        this.cargo = cargo;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAno() {
        return ano;
    }

    public String getCargo() {
        return cargo;
    }


    public abstract double calcularSalario(int ano);

    public abstract double calcularBeneficio(int mes, int ano);
}
