public class ContatoEmpresa extends Contato{
    String nomeEmpresa;
    String CNPJ;

    public ContatoEmpresa(String n, PLANO p, String t, String e, String nE, String c){
        super(n, p, t, e);
        nomeEmpresa = nE;
        CNPJ = c;
    }

    public String toString(){
        return super.toString() + " Nome da Empresa: " + nomeEmpresa + " CNPJ: " + CNPJ; 
    }
}
