
import javax.swing.JOptionPane;


//author Luã Tsuyoshi Borges Seki

public class Principal {

    public static void main(String[] args) {
        
        String nome;
        int idade;
        
        //Entrada
        nome= JOptionPane.showInputDialog("Digite seu nome");
        idade= Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        
        //Processamento
        if(idade<=7){
                JOptionPane.showMessageDialog(null, "Olá "+nome+", sua idade é: "+idade+" e sua categoria é Infantil A");  
        }else{
            if(idade<=11){
                JOptionPane.showMessageDialog(null, "Olá "+nome+", sua idade é: "+idade+" e sua categoria é Infantil B");
        }else{
            if(idade<=14){
                JOptionPane.showMessageDialog(null, "Olá "+nome+", sua idade é: "+idade+" e sua categoria é Juvnil A");
        }else{
            if(idade<=17){
                JOptionPane.showMessageDialog(null, "Olá "+nome+", sua idade é: "+idade+" e sua categoria é Juvnil B");
        }else{
            if(idade>=18){
                JOptionPane.showMessageDialog(null, "Olá "+nome+", sua idade é: "+idade+" e sua categoria é Adulto");
            }    
            } 
            }        
            }
        }
    }
}
