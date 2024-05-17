import entities.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario jorge = new Secretario("Jorge Carvalho", 1, 2018);
        Funcionario maria = new Secretario("Maria Souza", 12, 2015);
        Vendedor ana = new Vendedor("Ana Silva", 12, 2021);
        Vendedor joao = new Vendedor("João Mendes", 12, 2021);
        Gerente juliana = new Gerente("Juliana Alves", 7, 2017);
        Gerente bento = new Gerente("Bento Albino", 3, 2014);

        ana.getVendasMensais().put("12/2021", 5200.00);
        ana.getVendasMensais().put("01/2022", 4000.00);
        ana.getVendasMensais().put("02/2022", 4200.00);
        ana.getVendasMensais().put("03/2022", 5850.00);
        ana.getVendasMensais().put("04/2022", 7000.00);

        joao.getVendasMensais().put("12/2021", 3400.00);
        joao.getVendasMensais().put("01/2022", 7700.00);
        joao.getVendasMensais().put("02/2022", 5000.00);
        joao.getVendasMensais().put("03/2022", 5900.00);
        joao.getVendasMensais().put("04/2022", 6500.00);

        List<Funcionario> funcionarios = Arrays.asList(jorge, maria, ana, joao, juliana, bento);
        List<Vendedor> vendedores = Arrays.asList(ana, joao);

        Empresa empresa = new Empresa();

        System.out.println(empresa.calcularValorTotalPago(funcionarios, 4, 2022));
        System.out.println(empresa.calcularTotalPagoEmSalarios(funcionarios, 4, 2022));
        System.out.println(empresa.calcularTotalPagoEmBeneficios(funcionarios, 4, 2022));
        System.out.println(empresa.calcularFuncionarioMaisBemPago(funcionarios, 4, 2022));
        System.out.println(empresa.calcularFuncionarioComMaisBeneficios(funcionarios, 4, 2022));
        System.out.println(empresa.calcularVendedorComMaisVendas(vendedores, 4, 2022));
    }
}