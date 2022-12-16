import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DadosClientes {
    
    private String nomeArquivo;

    public DadosClientes(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }

    public void Salvar(Clientes c){
        try{
            File arquivo = new File(nomeArquivo);
            FileWriter n = new FileWriter(arquivo);
            BufferedWriter escrita = new BufferedWriter(n);

            for(Map.Entry<Contato, LocalDate> entrada : c.clientes.entrySet()){
                Contato cont = entrada.getKey();
                LocalDate data = entrada.getValue();
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM");
                String dataFormatada = data.format(formatador);

                escrita.write(cont.toString() + " " + dataFormatada + "\n");
            }

            escrita.close();
        

        } catch(IOException e){
            System.out.println(e.getMessage());
        }


    }

}
