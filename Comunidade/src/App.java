import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    //lista de Candidatos
    List<Candidato> listCandidatos = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos Candidatos serão cadastrados?");
    int n = sc.nextInt();

    for(int i = 0; i < n; i++){

        System.out.println("O candidato será pessoa fisica(1) ou pessoa juridica(2)?");
        int flag = sc.nextInt();

        try {
            if(flag == 1){
            int Patrimonio = sc.nextInt();
            String estado = sc.next();
            String nome = sc.next();
            String sobrenome = sc.next();
            String CPF = sc.next();
            listCandidatos.add(new PessoaFisica(Patrimonio, estado, nome, sobrenome, CPF));

        } else if(flag == 2) {
            int Patrimonio = sc.nextInt();
            String estado = sc.next();
            String RazaoSocial = sc.next();
            String CNPJ = sc.next();
            listCandidatos.add(new PessoaJuridica(Patrimonio, estado, RazaoSocial, CNPJ));
        }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }      
        for(Candidato candidato : listCandidatos){
            candidato.Imprimir();
        }

    }
}
