package br.com.coffeeandit;

import java.io.IOException;
import java.util.List;

public class Aplicacao {
    
    public static void main(String[] args) {
        FilmeStrategy filmeStrategy = FilmeFactory.criarFabrica();
        try {
            List<FilmeDto> filmeDtos = filmeStrategy.buscarFilmes();
            for (FilmeDto filmeDto: filmeDtos) {
                System.out.println(filmeDto);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
