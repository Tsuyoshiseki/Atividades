
package Contas;

import java.util.Scanner;

public class PA {
    public static void main(String[] args) {

    double a1;
    double a2;
    double r;
    double M;
    double an;
    double sn;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Me fale o primeiro valor");
    a1 = scan.nextDouble();
    
    System.out.println("Me fale o segundo valor");
    a2 = scan.nextDouble();
    
    r = a2 - a1;
    
    System.out.println("Me fale o montante");
    M = scan.nextDouble();
    
    an = a1 + (M-1) * r;
    
    sn = (a1 + an) * M /2;
    
    System.out.println("A soma dos termos da PA é: " +sn);
    }
}
