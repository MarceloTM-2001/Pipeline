package com.company;
import java.util.*;
import java.util.Scanner;
public class Calculadora {

        public static void main(String[] args) {
            com.company.Calculadora calc=new com.company.Calculadora();
            System.out.println(calc.add(20,5));
            System.out.println(calc.sub(30,5));
            System.out.println(calc.mult(5,5));
            System.out.println(calc.div(50,2));

        }
        public double add(double x, double y) {
            double result = x + y;
            return result;
        }

        public double sub(double x, double y){
            double result = x - y;
            return result;
        }

        public double mult(double x, double y) {
            double result = x * y;
            return result;
        }

        public double div(double x, double y) {
            double result = x / y;
            return result;
        }
}
