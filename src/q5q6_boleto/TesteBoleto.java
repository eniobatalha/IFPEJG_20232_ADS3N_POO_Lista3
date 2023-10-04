package q5q6_boleto;

import java.time.LocalDate;

public class TesteBoleto {

    public static void main(String[] args) {
        Boleto boleto1 = new Boleto("Ambev", 1560.00, LocalDate.of(2023, 4, 15));
        Boleto boleto2 = new Boleto("Coca-Cola", 2450.00, LocalDate.of(2023, 4, 10));
        Boleto boleto3 = new Boleto("Ambev", 1560.00, LocalDate.of(2023, 4, 4));

        System.out.println(boleto1.getValor());
        System.out.println(boleto2.getValor());
        System.out.println(boleto3.getValor());

        boleto3.prorrogarVencimento();

        if (boleto1.equals(boleto3)) {
            System.out.println("Boletos iguais");
        } else {
            System.out.println("Boletos diferentes");
        }


        boleto1.calcularValorFinal(LocalDate.of(2023, 4, 30));
        boleto2.calcularValorFinal(LocalDate.of(2023, 4, 30));
        boleto3.calcularValorFinal(LocalDate.of(2023, 4, 30));

        double somaBoletos = boleto1.getValor() + boleto2.getValor() + boleto3.getValor();
        System.out.printf("A soma dos três boletos SE FOREM PAGOS em 30/04/2023 é: R$ %.2f%n", somaBoletos);

    }
}
