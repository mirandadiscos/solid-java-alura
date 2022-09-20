package br.com.alura.rh.services;

import br.com.alura.rh.DataException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidaPeriodicidade implements ValidacaoReajuste{
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long intervalo = ChronoUnit.MONTHS.between(dataUltimoReajuste,dataAtual);
        if (intervalo > 6) {
            throw new DataException("Reajuste nao pode ser superior a 6 meses desde o ultimo");
        }
    }
}
