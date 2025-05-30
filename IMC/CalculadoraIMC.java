package BasicJava.IMC;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        sc.close();
    }
}
