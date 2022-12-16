import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.time.format.DateTimeFormatter;

public class Clientes{
    
    Map<Contato, LocalDate> clientes;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM");

    public Clientes(){
        this.clientes = new HashMap<Contato, LocalDate>();
    }

    public Clientes(Map<Contato, LocalDate> clientes){
        this.clientes = clientes;
    }

    public void agendaCliente(Contato c, LocalDate d){

        boolean existe = false;
        if(clientes.isEmpty() == true){
            clientes.put(c, d);
        }
        else{
            for(Map.Entry<Contato, LocalDate> entrada : clientes.entrySet()){
                Contato cont = entrada.getKey();
                LocalDate data = entrada.getValue();
                if(cont.nome == c.nome){
                    existe = true;
                    int mesAgendado = data.getMonthValue();
                    int mesNovo = d.getMonthValue();
                    if(mesAgendado < mesNovo){
                        entrada.setValue(d);
                    }
                    else if(mesAgendado == mesNovo){
                        int diaAgendado = data.getDayOfMonth();
                        int diaNovo = d.getDayOfMonth();
                        if(diaAgendado < diaNovo){
                            entrada.setValue(d);
                        }
                    }
                } 
            }
            if(existe == false){
                clientes.put(c, d);
            }



        }
        
    }

     public String toString(){

         StringBuilder retorno = new StringBuilder();
         for(Map.Entry<Contato, LocalDate> entrada : clientes.entrySet()){
             Contato cont = entrada.getKey();
             LocalDate data = entrada.getValue();
             String dataFormatada = data.format(formatador);
            
             retorno.append(cont.nome).append(" ").append(dataFormatada).append("\n");
         }

         return retorno.toString();



     }


}
