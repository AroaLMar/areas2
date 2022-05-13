package com.company;

public class Triangulo implements Figuras {

    private int base;
    private int altura;


    //Constructor con un argumento(radio)

    public int getBase() {
        return base;
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }


    //Solicitar area del triangulo
    public double area() {
        return (base * altura) / 2;
    }

}