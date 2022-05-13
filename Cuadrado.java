package com.company;


public class Cuadrado implements Figuras{

    public int getLado() {
        return lado;
    }

    private int lado;


    Cuadrado(int lado) {
        this.lado = lado;

    }



    //Calcular su area

    public double area() {
        return  lado * lado;

    }

}

