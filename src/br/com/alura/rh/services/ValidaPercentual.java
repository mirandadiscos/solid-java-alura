package br.com.alura.rh.services;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidaPercentual implements ValidacaoReajuste {
    public static final BigDecimal LIMIT_ALLOWED = new BigDecimal("0.4");
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);

        if (percentualReajuste.compareTo(LIMIT_ALLOWED) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
