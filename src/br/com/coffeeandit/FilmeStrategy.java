package br.com.coffeeandit;

import java.io.IOException;
import java.util.List;

public interface FilmeStrategy {
    
    List<FilmeDto> buscarFilmes() throws IOException;
}
