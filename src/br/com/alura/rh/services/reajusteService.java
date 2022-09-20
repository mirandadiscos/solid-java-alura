package br.com.alura.rh.services;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class reajusteService  {
    private List<ValidacaoReajuste> validacoes;

    public reajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioAjustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioAjustado);
        }
    }
