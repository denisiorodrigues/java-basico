package primeiroprojeto;

public class Calculadora {
    private int resultado;

    public void somar(int a, int b) {
        resultado =  a + b;
    }

    public void subtrair(int a, int b) {
        resultado = a - b;
    }

    public void imprimirResultado() {
        System.out.println("O resultado é: " + resultado);
    }
}
