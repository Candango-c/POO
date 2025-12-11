public class PessoaFisica extends Candidato {
    
    private String Nome;
    private String Sobrenome;
    private String CPF;

    // Set e Get do Nome
    public void setNome(String N){
        this.Nome = N;
    }

    public String getNome(){
        return this.Nome;
    }
    //

    //Set e Get do Sobrenome
    public void setSobrenome(String S){
        this.Sobrenome = S;
    }

    public String getSobrenome(){
        return this.Sobrenome;
    }
    //

    //Set e Get do CPF
    public void setCPF(String C) throws Exception{
        if(C.length() != 11){
            throw new Exception("O CPF possui menos de 11 caracteres");
        } else {

            this.CPF = C;
        }
    }

    public String getCPF(){

        return this.CPF;
    }

    //Construtora da Pessoa Fisica
    public PessoaFisica(double P, String E, String N, String S, String C) throws Exception{
        super(P, E);
        setNome(N);
        setSobrenome(S);
        setCPF(C);
    }
    //

    @Override
    //Impressao da PF
    public void Imprimir(){
        System.out.println("-Pessoa Fisica-");
        System.out.println("Patrimonio: "+super.getPatrimonio() * 1.05);
        super.ImprimeCandidato();
        System.out.println("Nome: "+getNome());
        System.out.println("Sobrenome: "+getSobrenome());
        System.out.println("CPF: "+getCPF());
    }
    //
}
