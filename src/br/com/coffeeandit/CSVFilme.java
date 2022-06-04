package br.com.coffeeandit;

import java.util.ArrayList;
import java.util.List;
import java.nio.file.Paths;
import java.io.IOException;
//import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVFilme implements FilmeStrategy {
    
    private static final String CSV_FILE = "C:\\Users\\camil\\OneDrive\\estudo_programacao\\imersao_java\\ImersaoJava\\movies.csv";

    @Override
    public List<FilmeDto> buscarFilmes() throws IOException {

        Path csvFile = Paths.get(CSV_FILE);
        List<FilmeDto> filmes = new ArrayList<>();
        if (Files.exists(csvFile)) {
            List<String> lines = Files.readAllLines(csvFile, StandardCharsets.UTF_8);
            for (String line: lines) {
                //System.out.print(line);
                String[] conteudo = line.split(",");
                FilmeDto filmeDto = new FilmeDto();
                filmeDto.setNome(conteudo[0]);
                filmeDto.setGenero(conteudo[1]);
                filmeDto.setEstudio(conteudo[2]);
                filmeDto.setPercentualAudiencia(Integer.parseInt(conteudo[3]));
                filmeDto.setLucratividade(Double.parseDouble(conteudo[4]));
                //System.out.println(filmeDto);    
                filmes.add(filmeDto);
            }
        }
        return filmes;
    }

    // private List<String> readAllLines(Path csvFile, Charset utf8) {
    //     return null;
    // }
}
