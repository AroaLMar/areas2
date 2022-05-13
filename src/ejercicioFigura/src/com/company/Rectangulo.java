package com.company;

import java.util.Scanner;

public class Rectangulo extends Figura {


    //atributos
    double base;
    double altura;


    //constructor

    //creo el objeto


    public Rectangulo(double base, double altura) {

        System.out.println("Introduzca la base");
        Scanner sc = new Scanner(System.in);
        this.base = sc.nextDouble();
        System.out.println("Introduzca la altura");
        this.altura = sc.nextDouble();
    }




    // Getter y setter
    public double getArea() {

        return base * altura;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return base * 2.0 + altura * 2.0;
    }


    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
