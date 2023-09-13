package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!!";

        //Usar o Suplier para obter uma lista com 5 saudacoes
        List<String> ListaSaudacoes = Stream.generate(saudacao)
        // If I want less code:
        // List<String> ListaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)!")
        .limit(5)
        .toList();

     //Imprimir as saudacoes geradas
     ListaSaudacoes.forEach(System.out::println);
    }


}
