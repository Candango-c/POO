public class PessoaJuridica extends Candidato {
    
    private String RazaoSocial;
    private String CNPJ;

    //get e set CNPJ
    public void setRazaoSocial(String R){
        this.RazaoSocial = R;
    }

    public String getRazaoSocial(){
        return this.RazaoSocial;
    }
    //

    //Set e Get do CNPJ
    public void setCNPJ(String C) throws Exception{
        if(C.length() != 14){
            throw new Exception("O CNPJ possui menos de 14 caracteres");
        } else {

            this.CNPJ = C;
        }
    }

    public String getCNPJ(){

        return this.CNPJ;
    }

    //Construtora
    public PessoaJuridica(double P, String E, String R, String C) throws Exception{
        super(P, E);
        setRazaoSocial(R);
        setCNPJ(C);
    }
    //

    @Override
    //Impressao da PJ
    public void Imprimir(){
        System.out.println("-Pessoa Juridica-");
        System.out.println("Patrimonio: "+super.getPatrimonio() * 1.10);
        super.ImprimeCandidato();
        System.out.println("CNPJ: "+getRazaoSocial());
        System.out.println("CNPJ: "+getCNPJ());
    }
}
