package entities;

import java.util.HashMap;
import java.util.Map;

public class Vendedor extends Funcionario {
    private final Map<String, Double> vendasMensais = new HashMap<>();

    public Vendedor(String nome, Integer mes, Integer ano) {
        super(nome, "Vendedor", mes, ano);
    }

    public Map<String, Double> getVendasMensais() {
        return vendasMensais;
    }

    @Override
    public double calcularSalario(int ano) {
        ano -= getAno();
        return 12000 + (ano * 1800);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        double resultado = 0.0;
        for (Double vendasMensais : getVendasMensais().values()) {
            resultado += vendasMensais;
        }
        return resultado * 30 / 100;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "vendasMensais=" + vendasMensais +
                '}';
    }
}

