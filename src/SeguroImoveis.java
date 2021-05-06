import java.util.Scanner;

public class SeguroImoveis extends ApoliceSeguro{
    //private static ApoliceSeguro imovel;
    private String endereco;
    private String cidade;
    private double tamanho;
    private double valorIPTU;

    public void imovel(double tamanho, double valorIPTU){
        this.endereco = "SC 406, 4348 - Rio vermelho";
        this.cidade = "Florianópolis";
        this.tamanho = tamanho;
        this.valorIPTU = valorIPTU;

    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getValorIPTU() {
        return valorIPTU;
    }

    public void setValorIPTU(double valorIPTU) {
        this.valorIPTU = valorIPTU;
    }
    
    public void calculoSeguro() {
        setCalculoSeguro((getValor() * 0.02 ) * ((getTamanho() / 100) * 1.05));
      }

    @Override
    public String toString() {
        return "SeguroImoveis [cidade=" + cidade + ", endereco=" + endereco + ", tamanho=" + tamanho + ", valorIPTU="
                + valorIPTU + "] \n";
    }

    public static void leImovel(SeguroImoveis imovel){
        Scanner myOption = new Scanner(System.in);
        System.out.println("Seguro de Imóvel \n");
        System.out.print("Código da apolice: ");
        imovel.setCodigo(myOption.next());
        System.out.print("Nome do cliente: ");
        imovel.setNomeCliente(myOption.next());
        System.out.print("Valor do Imovel: "); 
        imovel.setValor(myOption.nextDouble());
        System.out.print("Franquia: ");
        imovel.setFranquia(myOption.nextDouble());
        System.out.print("Restriçoes: ");
        imovel.setRestricao(myOption.next());
        System.out.print("Cidade: ");
        imovel.setCidade(myOption.next());
        System.out.print("Endereço: ");
        imovel.setEndereco(myOption.next());
        System.out.print("Tamanho em m²: ");
        imovel.setTamanho(myOption.nextDouble());
        System.out.print("IPTU: ");
        imovel.setValor(myOption.nextDouble());
    }
    
}  