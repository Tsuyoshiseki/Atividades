/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tsuyo
 */
public class Fibonacci {
    public static double fibonacci(double n) {
        double res = n;
        double a = 0, b = 1;

        for (double k = 2; k <= n; k++) {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }

    public static void main(String[] args) {
        double resultado = fibonacci(10);
        System.out.println("Fibonacci(10) = " + resultado);
    }
}
