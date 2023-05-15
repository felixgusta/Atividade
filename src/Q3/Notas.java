package Q3;

import java.util.Scanner;
import java.util.Stack;

public class Notas {

    public static void main(String[] args) {
        Stack<String> Lista_notas = new Stack<>();
        Stack<String> inversa = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma nota: ");
            String nota = scanner.nextLine();

            if (nota.equalsIgnoreCase("fim")) {
                break;
            }

//            Lista_notas.push(nota);
        }

       
        while (!Lista_notas.empty()) {
            String nota = Lista_notas.pop();
            inversa.push(nota);
            System.out.println(nota);
            System.out.println("Notas em ordem inversa:");

        }

       

        while (!inversa.empty()) {
            String nota = inversa.pop();
            System.out.println(nota);
            System.out.println("Notas em ordem inversa na pilha inversa:");
        }
    }

}
