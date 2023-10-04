package q3q4_funcionario;

import java.util.regex.*;

public class Funcionario {
	
	private String cpf;
	private String nome;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int obterQuantidadeLetrasNome() {
		String nome = this.getNome();
		int qtdLetrasNome = nome.replace(" ", "").length();
		return qtdLetrasNome;
	}
	
	public String obterNomeAbreviado(){
		String nome = this.getNome();
		String[] nomes = nome.split(" ");
		String PrimeiroNome = nomes[0];
		String UltimoNome = nomes[nomes.length -1];
		String nomeAbreviado = PrimeiroNome + " " + UltimoNome;
		return nomeAbreviado;
	} 
	
	public String obterIniciais(){
		String nome = this.getNome();
		String[] nomes = nome.split(" ");
		int qtdNomes = nomes.length;
		String iniciais = "";
		for (int i = 0; i<(qtdNomes); i++) {
			if (nomes[i].toLowerCase().equals("da") || nomes[i].toLowerCase().equals("e")) {
			// podemos criar condições para todos artigos-nomes possíveis (da, das, de, do, dos, e, etc...)
				continue;
			} else {
				iniciais += nomes[i].substring(0, 1);
			}
		}
		return iniciais;
	}
	
	public boolean verificarCPFFormatado() {
		String cpf = this.getCpf();
		String padrao = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(cpf);
        return matcher.matches();
	}
	
	public String formatarCPF() {
		String cpf = this.getCpf();
		String cpfFormatado = "";
		if (cpf.length() == 11) {
			cpfFormatado = cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11);
		} else {
			cpfFormatado = "CPF inválido";
		}
		return cpfFormatado;
	}
	
	public double obterNumeroSalariosMinimos() {
		double salario = this.getSalario();
		double salariosMin = salario / 1320.00;
		salariosMin = Math.round(salariosMin * 100.0) / 100.0;
		return salariosMin;
	}
	
	public void adicionarAumentoSalario(double percentualAumento) {
		double salario = this.getSalario();
		this.setSalario(salario * (percentualAumento/100 + 1));
	}
	
}