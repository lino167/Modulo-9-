public class Clientes implements Autenticador{
    private String nome;
    private boolean status;
    private String senha;
    private int compras;
    public Clientes(String nome, boolean status, String senha, int compras) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.compras = compras;
    }

    

    @Override
    public String toString() {
        return "Clientes [compras=" 
        + compras 
        + ", nome=" 
        + nome 
        + ", senha=" 
        + senha 
        + ", status=" 
        + status + "]";
    }

    @Override
    public boolean autentica(String senha){
        if(this.senha != senha){
            System.out.println("Senha inválida");
            return false;
        }else{
            return true;
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getCompras() {
        return compras;
    }
    public void setCompras(int compras) {
        this.compras = compras;
    }


}
