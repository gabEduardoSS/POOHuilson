import java.sql.SQLOutput;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Insira o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Qual operação você quer realizar?:" +
                "\n  A -> Adição" +
                "\n  S -> Subtração" +
                "\n  D -> Divisão" +
                "\n  M -> Multiplicação\n" +
                "Escreva aqui a letra correspondente: ");

        sc.nextLine();
        String opt = sc.nextLine();

        double sum = 0;
        String operacao = "";

        if(opt.toUpperCase().matches("^[ASDM]$")){
            switch (opt.toUpperCase()){
                case "A":
                    sum = num1 + num2;
                    operacao = "adição";
                    break;
                case "S":
                    sum = num1 - num2;
                    operacao = "subtração";
                    break;
                case "D":
                    sum = num1 / num2;
                    operacao = "divisão";
                    break;
                case "M":
                    sum = num1 * num2;
                    operacao = "multiplicação";
                    break;
            }
            System.out.printf("A %s dos números %.2f e %.2f é igual a: %.2f", operacao, num1, num2, sum);
        } else{
            System.out.println("Não é uma opção válida!");
        }
    }
}
