package br.com.seunome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = PontoUtils.calcularDistancia(x1, y1, x2, y2);

        System.out.printf("%.4f%n", distancia);
    }
}
