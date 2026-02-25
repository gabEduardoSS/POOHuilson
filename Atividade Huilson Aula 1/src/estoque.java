import java.util.Scanner;

public class estoque {
    public static Scanner sc = new Scanner(System.in);

    public static String[][] estoque = {{"Sorvete", "9", "100"}, {"Milkshake", "15", "100"}, {"Açaí", "25", "100"}};
    public static double caixa = 100;

    public static void main(String[] args) {

        System.out.println("Iniciando programa em loop eterno, pressione CTRL + F2 para fechar");
        while(true){
            System.out.print("Opções: " +
                    "\n   1 - Estoque" +
                    "\n   2 - Financeiro" +
                    "\n   3 - Comprar" +
                    "\n   4 - Vender" +
                    "\n Insira a opção correspondente: ");

            String opt = String.valueOf(sc.nextInt());
            System.out.print("\n");

            switch(opt){
                case "1":
                    System.out.print("-- Itens em estoque: ");
                    mostrarEstoque();
                    System.out.print("\n\n");
                    break;
                case "2":
                    System.out.printf("-- Dinheiro no caixa: R$%.2f", caixa);
                    System.out.print("\n\n");
                    break;
                case "3":
                    System.out.printf("-- Qual produto você deseja comprar? Disponíveis:");
                    System.out.printf("\n-- Saldo no caixa: R$%.2f", caixa);
                    mostrarEstoque();

                    do{
                        System.out.print("\nSelecione o produto(Insira 0 para sair): ");
                        int prod = sc.nextInt() - 1;
                        if(prod>=0 && prod<=estoque.length-1){
                            System.out.print("\nQuantidade: ");
                            int qtde = sc.nextInt();
                            if(qtde>0){
                                double custo = Double.valueOf(estoque[prod][1]) * qtde;
                                if(custo<=caixa){
                                    caixa -= custo;
                                    estoque[prod][2] = String.valueOf(Integer.parseInt(estoque[prod][2])+qtde);
                                    System.out.printf("-- Comprando: %d unidades do produto: %s, no valor total de R$%.2f.\n-- O saldo restante no caixa é de R$%.2f", qtde, estoque[prod][0], custo, caixa);
                                    mostrarEstoque();
                                } else{
                                    System.out.println("Não foi possível concluir a compra: valor excede quantidade em caixa");
                                }

                            } else{
                                System.out.println("Quantidade Inválida");
                            }
                        } else if(prod == -1){
                            break;
                        } else{
                            System.out.println("Produto Inválido");
                        }
                    }while(true);

                    System.out.print("\n");
                    break;
                case "4":
                    System.out.printf("-- Qual produto você deseja vender? Disponíveis:");
                    System.out.printf("\n-- Saldo no caixa: R$%.2f", caixa);
                    mostrarEstoque();

                    do{
                        System.out.print("\nSelecione o produto(Insira 0 para sair): ");
                        int prod = sc.nextInt() - 1;
                        if(prod>=0 && prod<=estoque.length-1){
                            System.out.print("\nQuantidade: ");
                            int qtde = sc.nextInt();
                            if(qtde>0 && qtde<=Integer.valueOf(estoque[prod][2])){
                                double ganho = Double.valueOf(estoque[prod][1]) * qtde * 1.05;
                                caixa += ganho;
                                estoque[prod][2] = String.valueOf(Integer.parseInt(estoque[prod][2])-qtde);
                                System.out.printf("-- Vendendo: %d unidades do produto: %s, no valor total de R$%.2f.\n-- O saldo restante no caixa é de R$%.2f", qtde, estoque[prod][0], ganho, caixa);
                                mostrarEstoque();

                            } else{
                                System.out.println("Quantidade Inválida");
                            }
                        } else if(prod == -1){
                            break;
                        } else{
                            System.out.println("Produto Inválido");
                        }
                    }while(true);

                    System.out.print("\n");
                    break;
            }
        }
    }

    public static void mostrarEstoque(){
        int i = 1;
        for(String[] produto : estoque){
            System.out.printf("\n-- %d -> %s || R$%.2f || estoque: %s", i, produto[0], Double.valueOf(produto[1]), produto[2]);
            i += 1;
        }
    }
}
