package com.kodilla.kalkulator;

public class Calculator {
    public double a;
    public double b;

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double add(){
        return a+b;
    }
    public double subtract(){
        return a-b;
    }

}


