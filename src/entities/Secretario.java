package entities;

public class Secretario extends Funcionario {

    public Secretario(String nome, Integer mesEntrada, Integer anoEntrada) {
        super(nome, "Secretário", mesEntrada, anoEntrada);
    }

    @Override
    public double calcularSalario(int ano) {
        ano -= getAno();
        return 7000.00 + (ano * 1000.00);
    }


    @Override
    public double calcularBeneficio(int mes, int anoContrato) {
        double salario = this.calcularSalario(anoContrato);
        return (salario * 20 / 100);
    }

}