public class ApoliceSeguro {
    private String codigo;
	private String nomeCliente;
	private String restricao;
	private double valor;
	private double franquia;
	private double calculoSeguro;

    public void seguro(String codigo, String nomeCliente, double valor){
		this.nomeCliente = nomeCliente;
		this.valor = valor;
		this.codigo = codigo;
		this.franquia = 200;
		this.restricao = "sem restrições";
	}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRestricao() {
        return restricao;
    }

    public void setRestricao(String restricao) {
        this.restricao = restricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getFranquia() {
        return franquia;
    }

    public void setFranquia(double franquia) {
        this.franquia = franquia;
    }

    public double getCalculoSeguro() {
        return calculoSeguro;
    }

    public void setCalculoSeguro(double calculoSeguro) {
        this.calculoSeguro = calculoSeguro;
    }

    @Override
    public String toString() {
        return "ApoliceSeguro [calculoSeguro=" + calculoSeguro + ", codigo=" + codigo + ", franquia=" + franquia
                + ", nomeCliente=" + nomeCliente + ", restricao=" + restricao + ", valor=" + valor + "]";
    }

    public void setEndereco(String next) {
    }

    public void setCidade(String next) {
    }

    public void setTamanho(double nextDouble) {
    }

    
}
