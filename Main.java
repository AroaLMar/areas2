package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        String opcion = "";

        double areaTotal = 0;
        double area=0;

        while (!opcion.equals("4")) {
            System.out.println("[1] -- MedioCirculo");
            System.out.println("[2] -- Triangulo");
            System.out.println("[3] -- Cuadrado");
            System.out.println("[4] -- Calcular Area");
            System.out.print("Opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Introduce el diametro");
                    int diametro=sc.nextInt();
                    int radio = diametro/2;
                    sc.nextLine();
                    MedioCirculo c1 = new MedioCirculo(radio);
                    area = c1.area();
                    areaTotal += area;
                    break;

                case "2":
                    System.out.println("Introduce la base");
                    int base = sc.nextInt();
                    System.out.println("Introduce la altura");
                    int altura = sc.nextInt();
                    sc.nextLine();
                    Triangulo t1 = new Triangulo(base, altura);
                    area = t1.area();
                    areaTotal += area;
                    break;

                case "3":
                    System.out.println("Introduce el lado");
                    int lado = sc.nextInt();
                    sc.nextLine();
                    Cuadrado cu1 = new Cuadrado(lado);
                    area = cu1.area();
                    areaTotal += area;
                    break;

                case "4":
                    System.out.println();
                    break;

                default:
                    System.out.println("Opcion no válida");
            }

        }

        System.out.println("El area total de la figura compuesta es " + areaTotal+ " cm2");


    }
}
