package Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionalidade<String> funcionalidade = new Funcionalidade<>();
        funcionalidade.Executar("tarefa 1");
        funcionalidade.Executar("tarefa 2");


        // Desfazer ultima ação
        //  no caso tira açao 2
        funcionalidade.desfazer();
        funcionalidade.desfazer();
        funcionalidade.desfazer();

        // Obter tamanho atual da lista
        int size = funcionalidade.getSize();
        System.out.println("Tamanho = " + size);
    }
}




