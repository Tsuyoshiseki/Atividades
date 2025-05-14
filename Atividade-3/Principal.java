
//author Luã Tsuyoshi Borges Seki

import javax.swing.JOptionPane;
 
public class Principal {

    public static void main(String[] args) {
        
    //Variáveis
        int dia;
         
    //Entrada   
        dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 1 a 7"));
        
        switch (dia) {
    
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu Domingo");
                break;
            case 2: 
                JOptionPane.showMessageDialog(null, "Você escolheu Segunda");
                break;
            case 3:   
                JOptionPane.showMessageDialog(null, "Você escolheu Terça");
                break;
            case 4:   
                JOptionPane.showMessageDialog(null, "Você escolheu Quarta");
                break;
            case 5:   
                JOptionPane.showMessageDialog(null, "Você escolheu Quinta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Você escolheu Sexta");
                break;
            case 7:  
                JOptionPane.showMessageDialog(null, "Você escolheu Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número Inválido");
                break;                
        }
            
    
    }
    
}
