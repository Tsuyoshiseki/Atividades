import java.util.Scanner;

/**
 * @author Luã Tsuyoshi
 */

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) 
            return 0;

        if (n == 1) 
            return 1;

        int res = 0;
        int a = 0;
        int b = 1;

        for (int k = 2;k <= n; k++) {
            res = a + b; 
            a = b;
            b = res;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o termo que quer saber o valor na Fibonacci:  ");
            int termo = scan.nextInt();

        int resultado = fibonacci(termo);
            System.out.println("Fibonacci(" + termo + ") = " + resultado);

        scan.close();
    }
}


    
