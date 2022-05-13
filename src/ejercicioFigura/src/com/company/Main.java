package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String opcion = "";

        while (!opcion.equals("4")) {
            System.out.println("[1] -- Construir un Rectangulo");
            System.out.println("[2] -- Construir un Triangulo");
            System.out.println("[3] -- Construir un Circulo");
            System.out.println("[4] -- SALIR");
            System.out.print("Opcion: ");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    construirRectangulo();
                    break;
                case "2":
                    construirTriangulo();
                    break;
                case "3":
                    construirCirculo();
                    break;
                case "4":
                    System.out.println("\n\t\tFIN DE PROGRAMA");
                    break;
                default:
                    System.out.println("Opcion equivocada\n");
            }
        }

    }

    private static void construirRectangulo() {
        System.out.print("\nBase: ");
        double base = Double.parseDouble(teclado.nextLine());
        System.out.print("Altura: ");
        double altura = Double.parseDouble(teclado.nextLine());

        Rectangulo rec = new Rectangulo(base, altura);

        System.out.println("Area calculada: " + rec.getArea());
        System.out.println("Perimetro calculado: " + rec.getPerimetro());
        System.out.println("\n");
    }

    private static void construirTriangulo() {
        System.out.print("\nBase: ");
        double base = Double.parseDouble(teclado.nextLine());
        System.out.print("Altura: ");
        double altura = Double.parseDouble(teclado.nextLine());
        System.out.print("Lado 1: ");
        double lado1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Lado 2: ");
        double lado2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Lado 3: ");
        double lado3 = Double.parseDouble(teclado.nextLine());

        Triangulo tri = new Triangulo(base, altura);

        System.out.println("Area calculada: " + tri.getArea());
        System.out.println("Perimetro calculado: " + tri.getPerimetro());
        System.out.println("\n");
    }

    private static void construirCirculo() {
        System.out.print("\nRadio: ");
        double radio = Double.parseDouble(teclado.nextLine());

        Circulo tri = new Circulo(radio);

        System.out.println("Area calculada: " + tri.getArea());
        System.out.println("Perimetro calculado: " + tri.getPerimetro());
        System.out.println("\n");
    }

}
