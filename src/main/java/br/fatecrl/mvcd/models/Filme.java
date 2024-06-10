package br.fatecrl.mvcd.models;

public class Filme {
    private String nome;
    private String diretor;
    private String estúdio;

    public Filme(String nome, String diretor, String estúdio) {
        this.nome = nome;
        this.diretor = diretor;
        this.estúdio = estúdio;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } 
    
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getEstúdio() {
        return estúdio;
    }
    public void setEstúdio(String estúdio) {
        this.estúdio = estúdio;
    }

}
