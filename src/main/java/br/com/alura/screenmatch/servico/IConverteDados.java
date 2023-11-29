package br.com.alura.screenmatch.servico;

public interface IConverteDados {

    <T> T obterDados(String json, Class <T> classe);
    // "T" é usasdo para generico
    
}
