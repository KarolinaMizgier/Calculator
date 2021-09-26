package com.kodilla.kalkulator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);

        Calculator calculator = new Calculator(28,15);
        System.out.println("Wynik dodawania: "+calculator.add());
        System.out.println("Wynik odejmowania: "+calculator.subtract());
    }

}
