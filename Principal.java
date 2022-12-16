import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
public class Principal {
    
    public static void main(String[] args) {
        Contato cont1 = new Contato("Fulano", PLANO.PARTICULAR, "22222222", "fulano@dominio.com");
        ContatoEmpresa cont2 = new ContatoEmpresa("Beltrano", PLANO.GOLDEN, "33333333", "beltrano@dominio.com", "UFF", "11111");
        Clientes cli = new Clientes();
        DadosClientes dados = new DadosClientes("DadosClientes.txt");

        // exemplificação do funcionamento do construtor do mapa por parâmetro
        /*
        Map<Contato, LocalDate> cliMain = new HashMap<Contato, LocalDate>();
        cliMain.put(cont1, LocalDate.of(2022, 10, 1));
        cliMain.put(cont2, LocalDate.of(2022, 9, 30));
        Clientes cliParam = new Clientes(cliMain);
        System.out.println(cliParam);
        */
        

        cli.agendaCliente(cont1, LocalDate.of(2022, 10, 1));
        cli.agendaCliente(cont2, LocalDate.of(2022, 9, 30));


        System.out.println(cli);

       

        // exemplificação dos métodos toString() das classes Contato e contatoEmpresa
        /*
        System.out.println(cont1);
        System.out.println(cont2);
        */

        // exemplificação do funcionamento da propriedade estabelecida pelo item d
        /*
        cli.agendaCliente(cont2, LocalDate.now());
        System.out.println(cli);
        cli.agendaCliente(cont2, LocalDate.of(2022, 9, 30));
        System.out.println(cli.toString());
        */

        // exemplificação do registro dos dados em um arquivo de texto
        // dados.Salvar(cli);
        
        
    
    }






    

    




}
