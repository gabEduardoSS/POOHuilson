import java.util.Scanner;

public class bemvindo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual seu nome?: ");
        String nome = sc.nextLine();

        System.out.printf("Bem vindo %s!", nome);
    }
}