package com.company;

public class Pruebas {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(2.0,4.0);
        Rectangulo r2 = new Rectangulo(3.0,6.0);
        System.out.println("RECTANGULOS");
        System.out.println("Perímetros");
        System.out.println("Rectángulo base " + r1.getBase()+ " y altura " +
                r1.getAltura() + " es " + r1.calcularPerimetro());
        System.out.println("Rectángulo base " + r2.getBase()+ " y altura " +
                r2.getAltura() + " es " + r2.calcularPerimetro());
        System.out.println("Area");
        System.out.println("Rectángulo base " + r1.getBase()+ " y altura " +
                r1.getAltura() + " es " + r1.calcularArea());
        System.out.println("Rectángulo base " + r2.getBase()+ " y altura " +
                r2.getAltura() + " es " + r2.calcularArea());
        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(4);
        System.out.println("CIRCULOS" );
        System.out.println("Perímetros");
        System.out.println("Circulo radio: "+ c1.getRadio()+ " : "
         +c1.getRadio());
        System.out.println("Circulo radio: "+ c2.getRadio()+ " : "
        +c2.calcularPerimetro());
        System.out.println("Area");
        System.out.println("Circulo radio: "+ c1.getRadio()+ " : "
         + c1.calcularArea());
         System.out.println("Circulo radio: "+ c2.getRadio()+ " : "
          +c2.calcularArea());
    }
}

