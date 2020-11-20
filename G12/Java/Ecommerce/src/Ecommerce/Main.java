package Ecommerce;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int valor;
        boolean validacao = true;
        int carrinho[] = new int[10];
        int contador = 0;
        int carrinhoQntd[] = new int[10];
        int opcao = 0;
        double soma = 0;
        int x = 0;
        char escolha;
        Pagamento pagamento = new Pagamento();
        List<Produto> prod = new ArrayList<>();
        prod.add(new Produto(1, "Arroz-1Kg      ", 30.00, 10));
        prod.add(new Produto(2, "Feijão-1Kg     ", 10.00, 10));
        prod.add(new Produto(3, "Farofa-500g    ", 5.99, 10));
        prod.add(new Produto(4, "Nescau           ", 6.99, 10));
        prod.add(new Produto(5, "Cartela 12-Ovos", 12.90, 10));
        prod.add(new Produto(6, "Cartela 24-Ovos", 21.99, 10));
        prod.add(new Produto(7, "Coca-Cola 2l   ", 5.00, 10));
        prod.add(new Produto(8, "Chinelo          ", 20.99, 10));
        prod.add(new Produto(9, "Balas FINI     ", 4.99, 10));
        prod.add(new Produto(10, "Cocada Caseira ", 3.99, 10));
        do {
            do {
                System.out.println(
                        "_______________________________________________\n\t\tD'TUDOUMPOUCO\n_______________________________________________");
                System.out.println("\nCÓDIGO   PRODUTO        PREÇO  ESTOQUE");
                for (Produto produ : prod) {
                    System.out.println(produ.getCodProd() + " - \t" + produ.getNome() + "\t" + produ.getPrecoUni()
                            + "\t" + produ.getEstoque());
                }
                do {
                    System.out.print("\nDigite o código do produto que deseja comprar: ");
                    valor = read.nextInt();
                    if (valor <= 0 || valor > 10) {
                        System.out.println("Digite um código válido: ");
                        validacao = true;
                    } else {
                        carrinho[contador] = valor;
                        validacao = false;
                    }
                } while (validacao == true);
                do {
                    System.out.print("Quantas unidades deseja comprar? ");
                    opcao = read.nextInt();
                    if (opcao <= 0 || opcao > 10) {
                        System.out.println("Digite uma quantidade válida");
                        validacao = true;
                    } else {
                        for (Produto produ : prod) {
                            if (produ.getCodProd() == valor) {
                                if (opcao > produ.getEstoque()) {
                                    System.out.println("\nEstoque: " + produ.getEstoque());
                                    System.out.println("Estoque Insuficiente");
                                    validacao = true;
                                } else {
                                    System.out.println();
                                    carrinhoQntd[contador] = opcao;
                                    validacao = false;
                                }
                            }
                        }
                    }
                } while (validacao == true);
                for (Produto produ : prod) {
                    if (produ.getCodProd() == valor) {
                        soma = (produ.getPrecoUni() * carrinhoQntd[contador]);
                        System.out.println(
                                produ.getCodProd() + "\t" + produ.getNome() + "\t" + produ.getPrecoUni() + "\n");
                        System.out.println(produ.getNome() + "\nUnidades Compradas: " + carrinhoQntd[contador]);
                        produ.diminuirEstoque(opcao);
                        System.out.println("\nO estoque é de: " + produ.getEstoque());
                    }
                }
                pagamento.somaTotal(soma);
                contador++;
                System.out.println(
                        "\n_______________________________________________\n\t\tCARRINHO\n_______________________________________________\n");
                if (contador == 0) {
                    for (Produto produ : prod) {
                        if (produ.getCodProd() == carrinho[0]) {
                            System.out
                                    .println(produ.getCodProd() + "\t" + produ.getNome() + "\t" + produ.getPrecoUni());
                        }
                    }
                } else {
                    x = 0;
                    for (int i = 0; i <= contador; i++) {
                        for (Produto produ : prod) {
                            if (produ.getCodProd() == carrinho[x]) {
                                System.out.println(
                                        produ.getCodProd() + "\t" + produ.getNome() + "\t" + produ.getPrecoUni());
                            }
                        }
                        x++;
                    }
                }
                do {
                    System.out.print("\nDeseja continuar S/N: ");
                    escolha = read.next().toUpperCase().charAt(0);
                    if (escolha == 'S' || escolha == 'N') {
                        validacao = true;
                    } else {
                        validacao = false;
                    }
                } while (validacao == false);
                if (escolha == 'S') {
                    validacao = true;
                } else if (escolha == 'N') {
                    System.out.println();
                    validacao = false;
                }
            } while (validacao == true);
            // Forma de pagamentos
            do {
                System.out.print(
                        " _____________________________________________\n|             FORMAS DE PAGAMENTO             |\n|_____________________________________________|\n|1 - Pagamento à vista em dinheiro ou cheque. | \n|_____________________________________________|\n|2 - Pagamento à vista em cartão de crédito.  | \n|_____________________________________________|\n|3 - Pagamento parcelado no Cartão.           | \n|_____________________________________________|\n\nDigite um número de (1 a 3): ");
                opcao = read.nextInt();
                if (opcao <= 0 || opcao > 3) {
                    validacao = false;
                } else {
                    validacao = true;
                }
            } while (validacao == false);
            System.out.println(pagamento.getPrecoTotal());
            if (opcao == 1) {
                pagamento.vistaDinheiro(pagamento.getPrecoTotal());
                System.out.printf("Preço Final: %.2f", pagamento.getDinheiro());
            } else if (opcao == 2) {
                pagamento.vistaCartao(pagamento.getPrecoTotal());
                System.out.printf("Preço Final: %.2f", pagamento.getCartao());
            } else if (opcao == 3) {
                do {
                    System.out.println("Parcelar em 2 vezes ou 3 vezes: ");
                    valor = read.nextInt();
                    if (valor == 2 || valor == 3) {
                        validacao = true;
                    } else {
                        validacao = false;
                    }
                } while (validacao == false);
                pagamento.parceladoCartao(opcao, pagamento.getPrecoTotal());
            }
            // Nota Fiscal
            System.out.println(
                    "\n_______________________________________________\n\t\tNOTA FISCAL\n_______________________________________________\n");
            if (contador == 0) {
                for (Produto produ : prod) {
                    if (produ.getCodProd() == carrinho[0]) {
                        System.out.println(produ.getCodProd() + " -\t" + produ.getNome() + "\t" + produ.getPrecoUni());
                    }
                }
            } else {
                x = 0;
                for (int i = 0; i <= contador; i++) {
                    for (Produto produ : prod) {
                        if (produ.getCodProd() == carrinho[x]) {
                            System.out.println(
                                    produ.getCodProd() + " -\t" + produ.getNome() + "\t" + produ.getPrecoUni());
                        }
                    }
                    x++;
                }
            }
            System.out.println("\nO preço total é de: " + pagamento.getPrecoTotal());
            if (opcao == 1) {
                System.out.println("\nCom acrescimo de 9% de imposto e desconto de 20% devido a forma de pagamento");
                System.out.printf("Preço: %.2f reais", pagamento.getDinheiro());
            } else if (opcao == 2) {
                System.out.println("\nCom acrescimo de 9% de imposto e desconto de 15% devido a forma de pagamento");
                System.out.printf("Preço: %.2f reais", pagamento.getCartao());
            } else if (valor == 2) {
                System.out.printf("\nForma de Pagamento: Parcelado em 2 vezes\n\tPreço Total: %.2f",
                        pagamento.getPrecoTotal());
            } else if (valor == 3) {
                System.out.printf("\nForma de Pagamento: Parcelado em 3 vezes\n\tPreço Total: %.2f",
                        pagamento.getPrecoTotal());
            }
            System.out.print("\n\nDeseja continuar S/N: ");
            escolha = read.next().toUpperCase().charAt(0);
            if (escolha == 'S') {
                x = 0;
                for (int i = 0; i < 10; i++) {
                    carrinho[i] = 0;
                    carrinhoQntd[i] = 0;
                }
                validacao = true;
            } else {
                System.out.println("Obrigado(a) por comprar conosco!");
                validacao = false;
            }
        } while (validacao == true);
    }
}
