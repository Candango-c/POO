import java.util.Date;

public class Voto {

    // O título do eleitor que realizou o voto (chave para evitar duplicidade)
    private String tituloEleitor;

    // Para quem foi o voto
    private String nomeCandidato;

    // Data em que o voto foi realizado
    private Date dataAtual;
    
    // Set e Get do Título do Eleitor
    public void setTituloEleitor(String t){
        this.tituloEleitor = t;
    }

    public String getTituloEleitor(){
        return this.tituloEleitor;
    }

    // Set e Get do nome do Candidato
    public void setNomeCandidato(String e){
        this.nomeCandidato = e;
    }

    public String getNomeCandidato(){
        return this.nomeCandidato;
    }

    // Set e Get da data atual
    public void setDataAtual(Date dt){
        this.dataAtual = dt;
    }

    public Date getDataAtual(){
        return this.dataAtual;
    }

    // Construtor completo
    public Voto(String t, String n, Date dt) {
        setTituloEleitor(t);
        setNomeCandidato(n);
        setDataAtual(dt);
    }

    public void ImprimeVoto(){
        System.out.println("Data do Voto: " +getDataAtual() + ", Título do Eleitor: " +getTituloEleitor() + ", Candidato Votado: " +getNomeCandidato());
    }
}