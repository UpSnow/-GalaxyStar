package ProjetoES;

public class ProjetoES {

    private int num1;
    private int num2;
    private int resultado;

    public void somar(int a, int b) {
        this.num1 = a;
        this.num2 = b;
        this.resultado = num1 + num2;
    }
    public void imprimirResultado() {
        System.out.println("A soma é: " + resultado);
    }
}


