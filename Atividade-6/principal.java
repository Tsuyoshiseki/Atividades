
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tsuyo
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Variáveis
        String nome;
        double nota1;
        double nota2;
        double media;
        
       Scanner leitor = new Scanner(System.in);    

        //Comando
            //Nome
    System.out.println("Diga seu nome");
    nome=leitor.next();
            //nota1
    System.out.println("Digite sua primeira nota");
    nota1=leitor.nextInt();        
            //nota2
    System.out.println("Digite sua segunda nota");
    nota2= leitor.nextInt();
    
            //media
    media = (nota1+nota2)/2;
    
    System.out.println("Parabéns " +nome +", sua nota é: " +media);
    
    }
}

