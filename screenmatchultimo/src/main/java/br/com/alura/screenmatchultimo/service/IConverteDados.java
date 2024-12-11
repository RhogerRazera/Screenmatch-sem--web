package br.com.alura.screenmatchultimo.service;

public interface IConverteDados {
     <T> T obterDados(String Json, Class <T> classe);
}
