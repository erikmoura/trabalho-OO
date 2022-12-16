import java.io.Serializable;
public class Contato implements Serializable{
    String nome;
    PLANO plano;
    String telefone;
    String email;

    public Contato(String n, PLANO p, String t, String e){
        nome = n;
        plano = p;
        telefone = t;
        email = e;
    }

    public String toString(){
        return "Nome: " + nome + " Plano: " + plano + " Telefone: " + telefone + " email: " + email;
    }
}
