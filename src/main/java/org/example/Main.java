package org.example;

public class Main {
    public static void main(String[] args) {

       Vendedor v = new Vendedor();
        v.setNome("Áfia");
        v.setSalario(1000.f);
        v.setCPF("05560885223");

        v.calcularSalario();

        System.out.println("O salario do vendedor é: " + v.calcularSalario());

       Motorista m = new Motorista();

    }
}