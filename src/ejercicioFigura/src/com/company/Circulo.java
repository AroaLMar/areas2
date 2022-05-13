package com.company;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {

        area = Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void calcularPerimetro() {

        perimetro = 2 * Math.PI * radio;
    }


}
