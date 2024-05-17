package entities;

import java.util.List;

public class Empresa {

    public String calcularValorTotalPago(List<Funcionario> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calcularSalario(ano) + f.calcularBeneficio(mes, ano);
        }
        return "Total pago em " + mes + "/" + ano + ": " + String.format("%.2f", total);
    }

    public String calcularTotalPagoEmSalarios(List<Funcionario> funcionarios, int mes, int ano) {
        double total = 0;

        for (Funcionario f : funcionarios) {
            total += f.calcularSalario(ano);
        }
        return "Total pago em salários em " + mes + "/" + ano + ": " + String.format("%.2f", total);
    }

    public String calcularTotalPagoEmBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
        double total = 0;

        for (Funcionario f : funcionarios) {
            if (!(f instanceof Gerente)) {
                total += f.calcularBeneficio(mes, ano);
            }
        }
        return "Total pago em benefícios em " + mes + "/" + ano + ": " + String.format("%.2f", total);
    }

    public String calcularFuncionarioMaisBemPago(List<Funcionario> funcionarios, int mes, int ano) {
        Funcionario maisBemPago = null;
        double maxPagamento = 0;

        for (Funcionario f : funcionarios) {
            double pagamento = f.calcularSalario(ano) + f.calcularBeneficio(mes, ano);
            if (pagamento > maxPagamento) {
                maxPagamento = pagamento;
                maisBemPago = f;
            }
        }
        assert maisBemPago != null;
        return "Funcionario mais bem pago em " + mes + "/" + ano + ": " + maisBemPago.getNome();
    }

    public String calcularFuncionarioComMaisBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
        Funcionario maisBeneficios = null;
        double maxBeneficios = 0;
        for (Funcionario f : funcionarios) {
            if (!(f instanceof Gerente)) {
                double beneficios = f.calcularBeneficio(mes, ano);
                if (beneficios > maxBeneficios) {
                    maxBeneficios = beneficios;
                    maisBeneficios = f;
                }
            }
        }
        assert maisBeneficios != null;
        return "Funcionário com mais benefícios em " + mes + "/" + ano + ": " + maisBeneficios.getNome();
    }

    public String calcularVendedorComMaisVendas(List<Vendedor> vendedores, int mes, int ano) {
        Vendedor melhorVendedor = null;
        double maxVendas = 0;

        for (Vendedor v : vendedores) {
            double vendas;
            if (mes < 10) {
                vendas = v.getVendasMensais().get(String.format("0%d/%d", mes, ano));
            } else {
                vendas = v.getVendasMensais().get(String.format("%d/%d", mes, ano));
            }
            if (vendas > maxVendas) {
                maxVendas = vendas;
                melhorVendedor = v;
            }
        }

        if (melhorVendedor != null) {
            return "Vendedor que mais vendeu em " + mes + "/" + ano + ": " + melhorVendedor.getNome();
        }
        return null;
    }
}



