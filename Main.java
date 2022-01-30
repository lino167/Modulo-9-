import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        Clientes cli1 = new Clientes("Miguel", true,"123", 5);
       
        Clientes cli2 = new Clientes("Arthur", true, "456", 28);

        Clientes cli3 = new Clientes("Gael", true,"789", 17);

        Clientes cli4 = new Clientes("Heitor", true, "321", 25);
 
        Clientes cli5 = new Clientes("Theo", true, "654", 10);

        Clientes cli6 = new Clientes("Davi", true, "987", 2);

        Clientes cli7 = new Clientes("Helena", true, "135", 30);

        Clientes cli8 = new Clientes("Alice", true, "579", 48);

        Clientes cli9 = new Clientes("Laura", true, "531", 80);

        Clientes cli10 = new Clientes("Maria", true, "975", 57);

        cli1.autentica("1234");
              
        List<Clientes> clientes = Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli3, cli6, cli7, cli8, cli9, cli10);
               
		Optional<Clientes> clienteGreen = clientes.stream().max(Comparator.comparingInt(Clientes::getCompras));
		Optional<Clientes> clienteRed = clientes.stream().min(Comparator.comparingInt(Clientes::getCompras));
        OptionalDouble clienteStream = clientes.stream().mapToInt(Clientes::getCompras).average();
        
        System.out.println("O cliente com mais compras é " + clienteGreen);
		System.out.println("Cliente com menos compras é " + clienteRed);
		System.out.println("A média de compras é " + clienteStream);
         
         
         
       }
    }
    

