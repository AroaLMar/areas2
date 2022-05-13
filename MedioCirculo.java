package com.company;

public class MedioCirculo implements Figuras{


        private int radio;


        //Constructor con un argumento(radio)

        public MedioCirculo(int radio) {
            this.radio=radio;
        }




        //Solicitar area y de la circunferencia
        public double area() {

            return (Math.PI * radio * radio)/2;
        }


    }










