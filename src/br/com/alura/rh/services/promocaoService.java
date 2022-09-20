package br.com.alura.rh.services;

import br.com.alura.rh.PromocaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class promocaoService {

    public void promover(Funcionario funcionario, boolean meta){
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual){
            throw new PromocaoException("Gerente nao recebe promocoes");
        }
        if (!meta){
            throw new PromocaoException("Funcionario nao bateu a meta");
        }
        Cargo novoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(novoCargo);
    }
}
