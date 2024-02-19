package org.example;

public class Main {
    public static void main(String[] args) {

        Complex z1 = new Complex(2, 3);
        Complex z2 = new Complex(4, 5);
         ServiceComplex ServiceComplex = new ServiceComplex();

        Complex sum = ServiceComplex.add(z1, z2);
        System.out.println("Сумма: " + sum.toString());

        Complex difference = ServiceComplex.sub(z1, z2);
        System.out.println("Разность: " + difference.toString());

        Complex product = ServiceComplex.mul(z1, z2);
        System.out.println("Произведение: " + product.toString());

        Complex quotient = ServiceComplex.div(z1, z2);
        System.out.println("Частное: " + quotient.toString());

        double modulus = ServiceComplex.Modul(z1);
        System.out.println("Модуль z1: " + modulus);

        boolean isEqual = ServiceComplex.Srav(z1, z2);
        System.out.println("z1 и z2 равны: " + isEqual);
    }

}