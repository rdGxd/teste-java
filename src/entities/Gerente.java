package entities;

public class Gerente extends Funcionario {
    public Gerente(String nome, Integer mes, Integer ano) {
        super(nome, "Gerente", mes, ano);
    }

    @Override
    public double calcularSalario(int ano) {
        ano -= getAno();
        return 20000.00 + (ano * 3000.00);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        return 0;
    }
}
