package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {

	private final DadosPessoais dadosPessoais;

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}
	private Cargo cargo;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(DadosPessoais dadosPessoais, Cargo cargo, BigDecimal salario) {
		this.cargo = cargo;
		this.dadosPessoais = dadosPessoais;
		this.salario = salario;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
		setDataUltimoReajuste(LocalDate.now());
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public Cargo getCargo() { return cargo; }

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.cargo = novoCargo;
	}
}
