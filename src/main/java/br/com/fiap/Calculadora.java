package br.com.fiap;

public class Calculadora {

    private double resultado;

    public Calculadora() {

    }

    public double getResultado() {
        return resultado;
    }

    public double soma(double valor1, double valor2){
        this.resultado = valor1 + valor2;
        return resultado;
    }

    public double subtrair(double valor1, double valor2){
        this.resultado = valor1 - valor2;
        return resultado;
    }


}
