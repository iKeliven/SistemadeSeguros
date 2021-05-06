import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SeguroVida extends ApoliceSeguro{
    private String dataNascimento;
    private String nomeBeneficiario;
    private double carencia;

    public void vida(String dataNascimento, String nomeBeneficiario, double graceValue){
        this.dataNascimento = dataNascimento;
        this.nomeBeneficiario = nomeBeneficiario;
        this.carencia = carencia;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public double getCarencia() {
        return carencia;
    }

    public void setCarencia(double carencia) {
        this.carencia = carencia;
    }
    
    public void calculoSeguro() throws ParseException {
		Calendar agora = Calendar.getInstance();
		Calendar dataNascimento = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data = formato.parse(getDataNascimento());
		dataNascimento.setTime(data);
		
		Integer idade = (agora.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR));
    setCalculoSeguro(Math.round( idade / 10) * 0.3);
    
}

  @Override
    public String toString() {
        return "SeguroVida [carencia=" + carencia + ", dataNascimento=" + dataNascimento + ", nomeBeneficiario="
                + nomeBeneficiario + "] \n";
    }

public static void leVida(SeguroVida vida){
    Scanner myOption = new Scanner(System.in);
    System.out.println("Seguro de Vida \n");
    System.out.print("Código da apólice: ");
    vida.setCodigo(myOption.next());
    System.out.print("Nome do cliente: ");
    vida.setNomeCliente(myOption.next());
    System.out.print("Valor do bem: ");
    vida.setValor(myOption.nextDouble());
    System.out.print("Franquia: ");
    vida.setFranquia(myOption.nextDouble());
    System.out.print("Restriçoes: ");
    vida.setRestricao(myOption.next());
    System.out.print("Data de nascimento do beneficiado: ");
    vida.setDataNascimento(myOption.next());
    System.out.print("Nome do beneficiado: ");
    vida.setNomeBeneficiario(myOption.next());
    System.out.print("Valor da Carencia: ");
    vida.setCarencia(myOption.nextDouble());
  }

}
