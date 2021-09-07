package com.company;
import org.junit.jupiter.api.Test;
public class CalcTest {
    @Test
    void add(){
        Calculadora calc=new Calculadora();
        calc.add(5.9,6);
        calc.add(-86.6,5.36);
        calc.add(-9,-6);
    }
    @Test
    void sub(){
        Calculadora calc=new Calculadora();
        calc.sub(5.9,6);
        calc.sub(-86.6,5.36);
        calc.sub(-9,-6);
    }
    @Test
    void mult(){
        Calculadora calc=new Calculadora();
        calc.mult(5.9,6);
        calc.mult(-86.6,5.36);
        calc.mult(-9,-6);
    }
    @Test
    void div(){
        Calculadora calc=new Calculadora();
        calc.div(5.9,6);
        calc.div(-86.6,5.36);
        calc.div(-9,-6);
    }
}


