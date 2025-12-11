import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
    //lista de Candidatos
    List<Candidato> listCandidatos = new ArrayList<>();

    //Conjunto de votos
    Map<String, Voto> HashVotos = new HashMap<>();
    
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

    System.out.println("Quantos Eleitores serão cadastrados?");
    int numE = sc.nextInt();

    List<Eleitores> listEleitores = new ArrayList<>();

    for(int i=0; i < numE; i++){
        
        System.out.println("O eleitor terá Nome(1) ou será sem nome(2)?");
        int flagE = sc.nextInt();


        try{
            if(flagE == 1){
                String NomeE = sc.next();
                String EstadoE = sc.next();
                String Titulo = sc.next();
        
                listEleitores.add(new Eleitores(NomeE, EstadoE, Titulo));

            } else {
                String EstadoE = sc.next();
                String Titulo = sc.next();
            
                listEleitores.add(new Eleitores(EstadoE, Titulo));

            }

        } catch(Exception e){
            System.out.println(e);
        }

    }

    System.out.println("---Eleição---");
    for(int i=0; i < numE; i++){
        System.out.print("Digite o Título do Eleitor: ");
        String titulo = sc.next();
        System.out.print("Digite o Nome do Candidato no qual o eleitor irá votar: ");
        String candidato = sc.next();

        Voto novoVoto = new Voto(titulo, candidato, new Date());

        if (HashVotos.containsKey(titulo)) {
                System.out.println("O eleitor com Título " + titulo + " já votou.");
            } else {
                HashVotos.put(titulo, novoVoto);
                System.out.println("Voto registrado com sucesso.");
            }
    }

    System.out.println("Digite o Título do Eleitor para buscar o voto:");
    String tituloBuscado = sc.next();

    if(HashVotos.containsKey(tituloBuscado)){
        HashVotos.get(tituloBuscado).ImprimeVoto();
    } else {
        System.out.println("Voto não encontrado.");
    }

    System.out.println("Total de votos na eleição: "+HashVotos.size() + "Segue os votos:");

    for (Voto voto : HashVotos.values()) {
            voto.ImprimeVoto();
        }

    sc.close();

    }
}
