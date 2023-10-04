package q5q6_boleto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Boleto {
	private String fornecedor;
	private double valor;
	private LocalDate dataVencimento;
	
	public Boleto (String fornecedor, double valor, LocalDate dataVencimento) {
		this.fornecedor = fornecedor;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public boolean verificarEmDia() {
		boolean resultado;
		LocalDate vencimento = this.dataVencimento;
		if (vencimento.isAfter(LocalDate.now())) {
			resultado = true;
		} else if (vencimento.isEqual(LocalDate.now())){
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	public double calcularMulta(LocalDate dataPagamento) {
		double valorComMulta = 0.0;
		if (!this.verificarEmDia()) {
			double jurosPorDiaAtrasado = 1.0;
	        long diasDeAtraso = ChronoUnit.DAYS.between(this.getDataVencimento(), dataPagamento);
	        double valorOriginal = this.getValor();
	        valorComMulta = valorOriginal + (valorOriginal * (jurosPorDiaAtrasado / 100.0) * diasDeAtraso);
		}
		return valorComMulta;
	}
	
	public void prorrogarVencimento() {
		LocalDate novoVencimento = dataVencimento.plusDays(5);
		this.setDataVencimento(novoVencimento);		
	}
	
	public double calcularDesconto(LocalDate dataPagamento) {
		double valorComDesconto = 0.0;
		if (this.verificarEmDia()) {
			double descontoPorDiaAdiantado = 0.5;
			long diasDeAdiantamento = ChronoUnit.DAYS.between(dataPagamento, this.getDataVencimento());
			double valorOriginal = this.getValor();
			valorComDesconto = valorOriginal - (valorOriginal * (descontoPorDiaAdiantado / 100.0) * diasDeAdiantamento);
		}
		return valorComDesconto;
	}
	
	public double calcularValorFinal(LocalDate dataPagamento) {
		if (this.getDataVencimento() == dataPagamento){
			this.setValor(this.getValor());			
		} else if (this.verificarEmDia()) {
			this.setValor(this.calcularDesconto(dataPagamento));
		} else {
			this.setValor(this.calcularMulta(dataPagamento));
		}
		return this.getValor();
	}
	
	public boolean equals(Boleto boleto2) {
		if (this.getFornecedor().equals(boleto2.getFornecedor()) && this.getValor() == boleto2.getValor()) {
			return true;
		} else {
			return false;
		}
	}
		
}
