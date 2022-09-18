
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char conceito = 'C';
        System.out.println("Escolha n1");
        float n1 = input.nextFloat();
        System.out.println("Escolha n2");
        float n2 = input.nextFloat();
        float media = (n1+n2)/2;
                if (media >=9){
                    conceito= 'A';
                }else if(media>=8 && media <9){
                    conceito='B';
                }else if(media >=7 && media <8){
                    conceito='C';
                }else if(media >=6 && media <7){
                    conceito='D';
                }else{ conceito = 'E';
                }
                
                    
                    
                    
                    
                    
        switch (conceito) {
            case 'A':         
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Mediano");
                break;
            case 'C': 
                System.out.println("Você teve um mal desempenho");
                break;
            case 'D':
                System.out.println("tente denovo");
                break;
            case 'E':
                System.out.println("Inicie do zero");
                break;
                
                
        }
    }
}
