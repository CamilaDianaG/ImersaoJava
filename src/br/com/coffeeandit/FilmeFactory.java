package br.com.coffeeandit;

public class FilmeFactory {
    
    private FilmeFactory(){

    }
    public static FilmeStrategy criarFabrica(){ 
        /* static = referencia todos aqueles atributos/métodos de classe, ou eja,
            que podem ser acessados diretamente da definição da classe, 
            sem precisar instanciar nenhum objeto. Você não precisa instanciar um objeto 
            pra acessar algum método dela
        */
        return new CSVFilme();
    }
}
