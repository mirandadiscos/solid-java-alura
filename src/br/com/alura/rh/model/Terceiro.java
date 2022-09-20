package br.com.alura.rh.model;

public class Terceiro {
    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceiro(DadosPessoais dadosPessoais,String empresa) {
        this.dadosPessoais = dadosPessoais;
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getEmpresa() { return empresa; }

    public void setEmpresa(String empresa) { this.empresa = empresa; }
}
