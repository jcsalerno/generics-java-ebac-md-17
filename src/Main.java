import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Carro> listaDeCarros = new ArrayList<>();


        listaDeCarros.add(new Carro("Gol", "Volkswagen"));
        listaDeCarros.add(new Sedan("Civic", "Honda", 450));
        listaDeCarros.add(new SUV("Compass", "Jeep", true));

        for (Carro carro : listaDeCarros) {
            System.out.println(carro);
        }
        }
    }
