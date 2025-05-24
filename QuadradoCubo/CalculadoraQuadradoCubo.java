package BasicJava.QuadradoCubo;

public class CalculadoraQuadradoCubo {

    public static int calcularQuadrado(int numero) {
        return numero * numero;
    }

    public static int calcularCubo(int numero) {
        return numero * numero * numero;
    }

    public static void main(String[] args) {
        int numero = 9; // Exemplo de número para calcular o quadrado e o cubo
        System.out.println("Quadrado de " + numero + ": " + calcularQuadrado(numero));
        System.out.println("Cubo de " + numero + ": " + calcularCubo(numero));
    }

}
