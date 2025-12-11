public abstract class Candidato {
    
    private double Patrimonio;
    private String Estado;

    // Set e Get do Patrimonio
    public void setPatrimonio(double P) throws Exception{
        if(P <= 0){
            throw new Exception("O valo do patrimonio nao pode ser negativo ou zero");
        } else {
            this.Patrimonio = P;
        }
    }
    public double getPatrimonio(){
        return this.Patrimonio;
    }
    //

    //Set e Get do Estado
    public void setEstado(String E)throws Exception{

        if(!E.equals("ES") && !E.equals("SP")){
            throw new Exception("O estado deve ser ES ou SP");
        }else {
            this.Estado = E;
        }
    }

    public String getEstado(){
        return this.Estado;
    }
    //

    //Contrutora do Candidato
    public Candidato(double P, String E) throws Exception{
        setPatrimonio(P);
        setEstado(E);
    }
    //

    //Impressao do candidato
    public final void ImprimeCandidato(){
        System.out.println("Estado: "+getEstado());
    }
    //

    // Método abstrato para imprimir as classes de herança
    public abstract void Imprimir();
}
