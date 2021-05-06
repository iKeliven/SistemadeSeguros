import java.util.Scanner;

public class SeguroVeiculo extends ApoliceSeguro {
    private String marca;
    private String modelo;
    private int ano;
    private String enderecoResidencial;

    public void veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.enderecoResidencial = "SC 406, 4348 - Rio Vermelho";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }
    public void calculoSeguro() {
		int tempoUso = 2021 - getAno();
		double valor = 0;

		if (tempoUso >= 5){
			valor = 0.05;
		}else if (tempoUso >= 10){
			valor = 0.1;
		}else {
			valor = 0.2;
		}
    setCalculoSeguro(getValor() * valor);
  }

    @Override
    public String toString() {
        return "SeguroVeiculo [ano=" + ano + ", enderecoResidencial=" + enderecoResidencial + ", marca=" + marca
                + ", modelo=" + modelo + super.toString() + "] \n";
    }
    
    public static void leVeiculo (SeguroVeiculo veiculo){
        Scanner myOption = new Scanner(System.in);
        System.out.println("Seguro de Veículo \n");
        System.out.print("Código da apólice: ");
        veiculo.setCodigo(myOption.next());
        System.out.print("Nome do cliente: ");
        veiculo.setNomeCliente(myOption.next());
        System.out.print("Valor do carro: ");
        veiculo.setValor(myOption.nextDouble());
        System.out.print("Franquia: ");
        veiculo.setFranquia(myOption.nextDouble());
        System.out.print("Restriçoes: ");
        veiculo.setRestricao(myOption.next());
        System.out.print("Marca: ");
        veiculo.setMarca(myOption.next());
        System.out.print("Modelo: ");
        veiculo.setModelo(myOption.next());
        System.out.print("Ano: ");
        veiculo.setAno(myOption.nextInt());
        System.out.print("Endereço Residencial: ");
        veiculo.setEnderecoResidencial(myOption.next());
    }

}
