
import javax.swing.JOptionPane;

//author Luã Tsuyoshi Borges Seki

public class Principal {

    public static void main(String[] args) {
      
        //Variável
        String nome;
        String senha;
        
        //Entrada
        nome= JOptionPane.showInputDialog("Login:");
        senha= JOptionPane.showInputDialog("Senha:");
                
        //Processamento
        if(nome.equals("aluno") && senha.equals("aluno")){
            JOptionPane.showMessageDialog(null, "Login correto");
        }else{
            JOptionPane.showMessageDialog(null, "Login incorreto");
            
         }
    }
}
