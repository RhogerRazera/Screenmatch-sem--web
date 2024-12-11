package br.com.alura.screenmatchultimo.service;


import br.com.alura.screenmatchultimo.model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ConverteDados implements IConverteDados  {
    private ObjectMapper mapper = new ObjectMapper ();


    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue (json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
