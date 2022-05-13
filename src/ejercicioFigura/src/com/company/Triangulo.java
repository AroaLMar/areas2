package com.company;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;

        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        area = base * altura / 2;
    }

    @Override
    public void calcularPerimetro() {

        perimetro = 3 * base;
    }

}
