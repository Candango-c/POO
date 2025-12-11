public class Eleitores {
    
    private String Nome;
    private String Estado;
    private String TituloEleitoral;

    // Set e Get do Nome
    public void setNome(String N){
        this.Nome = N;
    }

    public String getNome(){
        return this.Nome;
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

    // Set e Get do Titulo
    public void setTituloEleitoral(String T){
        this.TituloEleitoral = T;
    }

    public String getTituloEleitoral(){
        return this.TituloEleitoral;
    }
    //

    //Construtora Completo
    public Eleitores(String N, String E, String T)throws Exception{
        setNome(N);
        setEstado(E);
        setTituloEleitoral(T);
    }
    //

    //Construtora Titulo Estado
    public Eleitores(String E, String T)throws Exception{
        setEstado(E);
        setTituloEleitoral(T);
    }
    //

    public final void ImpreTITULOEleitores(){
        System.out.println("Titulo: "+getTituloEleitoral());
    }

    public final void ImpreEleitores(){
        System.out.println("Titulo: "+getTituloEleitoral());
        System.out.println("Nome: "+getNome());
    }
}
