package prog2_ExerArray;					//Angélica de Carvalho Teixeira 22.2.8015

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> listaDeStrings = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String digite;

        // Solicita ao usuário informar Strings até inserir a String "secreta"
        System.out.println("Informe algumas strings (digite 'secreta' para encerrar):");

        while (true) {
            digite = entrada.nextLine();

            // Verifica se a String digitada é a "secreta" para encerrar a entrada
            if (digite.equals("secreta")) {
                break;
            }

            listaDeStrings.add(digite); //tendi
        }

        // Imprime os valores originais da lista
        System.out.println("Valores originais da lista:");
        for (String string : listaDeStrings) {
            System.out.println(string);
        }

        // Ordena a lista em ordem crescente, somente em caso de números
        Collections.sort(listaDeStrings);

        // Imprime os valores ordenados da lista
        System.out.println("Valores ordenados da lista:");
        for (String string : listaDeStrings) {
            System.out.println(string);
        }
        
        entrada.close();
    }
}
