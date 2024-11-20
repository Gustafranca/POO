import java.security.SecureRandom;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int num_aluno;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o numero de alunos: ");
        num_aluno = input.nextInt();
       
        SecureRandom gerador = new SecureRandom();

        Enquete enquete = new Enquete(num_aluno);
        int[] notas = new int[num_aluno];
        for(int i=0;i<num_aluno;i++){
            notas[i] = gerador.nextInt(11);    
        }
        enquete.setNotas(notas);
        System.out.println("A quantidade de alunos votantes foi: " + enquete.contaCliente());
        enquete.frequencia(notas, num_aluno);

        System.out.println("A media é : "+ enquete.media(notas, num_aluno));
        input.close();
    }

}
