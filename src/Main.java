import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ParseException {
    Scanner myOption = new Scanner(System.in);
    int opcao = 0;
    int opcaoMenu = 0;
    int opcao2 =0; 
    String opcaoRemover;

    ArrayList listaImoveis = new ArrayList();
    ArrayList listaVida = new ArrayList();
    ArrayList listaVeiculos = new ArrayList();
    SeguroImoveis imovel = new SeguroImoveis();
    SeguroVeiculo veiculo = new SeguroVeiculo();
    SeguroVida vida = new SeguroVida();

    do {
        System.out.println("Menu Principal\n");
        System.out.println("[1] Adicionar seguro");
        System.out.println("[2] Listar seguros");
        System.out.println("[3] Remover seguro");
        System.out.println("[0] Sair\n");
        System.out.println("Digite a opção desejada");
        opcao = myOption.nextInt();
        System.out.println("-----------\n");

        if (opcao == 1) {
            System.out.println("Escolha o seguro para adicionar\n");
            System.out.println("1 - Seguro de imóvel");
            System.out.println("2 - Seguro de veículo");
            System.out.println("3 - Seguro de vida");
            System.out.println("4 - Voltar\n");
            System.out.println("Digite a opção desejada");
            opcaoMenu = myOption.nextInt();
            
            if (opcaoMenu == 1) {
                SeguroImoveis novoImovel = new SeguroImoveis();
                SeguroImoveis.leImovel(novoImovel);

                novoImovel.calculoSeguro();
                listaImoveis.add(novoImovel);
                System.out.println("Seguro de imovel cadastrado com sucesso!\n");

            } else if (opcaoMenu == 2){ 
                SeguroVeiculo novoVeiculo = new SeguroVeiculo();
                SeguroVeiculo.leVeiculo(novoVeiculo);
                novoVeiculo.calculoSeguro();
                listaVeiculos.add(novoVeiculo);
                System.out.println("Seguro de veiculo cadastrado com sucesso!\n");

            } else if(opcaoMenu == 3 ){
                SeguroVida novoVida = new SeguroVida();
                SeguroVida.leVida(novoVida);
                novoVida.calculoSeguro();
                vida.calculoSeguro();
                listaVida.add(novoVida);
                System.out.println("Seguro de vida cadastrado com sucesso!\n");
            } else {
                System.out.print("-------------\n");
                continue;
                }

            } else if (opcao == 2) {
                System.out.println("Listar seguros\n");
                System.out.println("1 - Seguro de imóvel");
                System.out.println("2 - Seguro de vida");
                System.out.println("3 - Seguro de veículo");
                System.out.println("4 - Voltar\n");
                System.out.println("Digite a opção desejada");
                opcao2 = myOption.nextInt();
                if (opcao2 == 1){ 
                    System.out.println("Lista de seguros de Imóveis");
                    System.out.println(String.format("Seguro de imovel [%d]", listaImoveis.size()));
                    System.out.println(listaImoveis);
                } else if (opcao2 == 2){
                    System.out.println("Lista de seguros de veículos");
                    System.out.println(String.format("Seguro de veículo [%d]", listaVeiculos.size()));
                    System.out.println(listaVeiculos);
                } else if (opcao2 == 3){
                    System.out.println("Lista de seguros de vida");
                    System.out.println(String.format("Seguro de vida [%d]", listaVida.size()));
                    System.out.println(listaVida);
                }
            } else if (opcao == 3) {
                System.out.println("Remover Seguro");
                System.out.println("Digite o codigo da apólice: ");
                opcaoRemover = myOption.next();
                for (int i = 0; i < listaImoveis.size(); i++) {
                SeguroImoveis obj1 = (SeguroImoveis) listaImoveis.get(i);
                    if (obj1.getCodigo().equals(opcaoRemover)) {
                        listaImoveis.remove(obj1);
                        System.out.println("Seguro removido com sucesso!");

                    } 
                }
                for (int i = 0; i < listaVeiculos.size(); i++) {
                SeguroVeiculo obj1 = (SeguroVeiculo) listaVeiculos.get(i);
                    if (obj1.getCodigo().equals(opcaoRemover)) {
                        listaVeiculos.remove(obj1);
                        System.out.println("Seguro removido com sucesso!");
                      }
                }
                for (int i = 0; i < listaVida.size(); i++) {
                SeguroVida obj1 = (SeguroVida) listaVida.get(i);
                    if (obj1.getCodigo().equals(opcaoRemover)) {
                      listaVida.remove(obj1);
                      System.out.println("Seguro removido com sucesso!");
                    }
                }
            } else {
                System.out.println("--------------\n");
                return;
              }
            } while (opcao != 0);
          }
}
