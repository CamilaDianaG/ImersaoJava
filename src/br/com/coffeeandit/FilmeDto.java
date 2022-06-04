package br.com.coffeeandit;

import java.util.Objects;

public class FilmeDto {  // criar variáveis de forma clara (o que elas são e o que representam)

    private String nome;
    private String genero;
    private String estudio;
    private int percentualAudiencia;
    private double lucratividade;
    private int aprovacaoPremio;
    private String faturamento;
    private int anoLancamento;

    // public = permite acesso a qualquer código externo a classe
    // protected = permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo
    // private = proíbe qualquer acesso externo à própria classe, inclusive das classes filhas

    public String getNome(){    // public = permite acesso a qualquer código externo a classe / get = recuperar
        return nome;    // return = retornar
    }

    public void setNome(String nome){   // set = alterar / void = não retorna nada
        this.nome = nome;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getEstudio(){
        return estudio;
    }

    public void setEstudio(String estudio){
        this.estudio = estudio;
    }

    public int getPercentualAudiencia(){
        return percentualAudiencia;
    }

    public void setPercentualAudiencia(int percentualAudiencia){
        this.percentualAudiencia = percentualAudiencia;
    }

    public double getLucratividade(){
        return lucratividade;
    }

    public void setLucratividade(double lucratividade){
        this.lucratividade = lucratividade;
    }

    public int getAprovacaoPremio(){
        return aprovacaoPremio;
    }

    public void setAprovacaoPremio(int aprovacaoPremio){
        this.aprovacaoPremio = aprovacaoPremio;
    }

    public String getFaturamento(){
        return faturamento;
    }

    public void setFaturamento(String faturamento){
        this.faturamento = faturamento;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;
        if (o == null || getClass() != o.getClass())
        return false;
        FilmeDto filmeDto = (FilmeDto) o;
        return nome.equals(filmeDto.nome) && estudio.equals(filmeDto.estudio);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, estudio);
    }

    @Override
    public String toString() {
        return "FilmeDto {nome=" + nome +
                    ", genero=" + genero +
                    ", estudio=" + estudio +
                    ", percentualAudiencia=" + percentualAudiencia +
                    ", lucratividade=" + lucratividade +
                    ", aprovacaoPremio=" + aprovacaoPremio +
                    ", faturamento=" + faturamento +
                    ", anoLancamento=" + anoLancamento +               
                "}";
    }
    
}
