package br.com.lojaacum.principal;

public class Produto {
    String nome;
    double preco;
    String material;
    String maquina;

    // Este é o Construtor! Ele sempre tem o mesmo nome exato da Classe.
    public Produto(String nome, double preco, String material, String maquina) {
        this.nome = nome;
        this.preco = preco;
        this.material = material;
        this.maquina = maquina;
    }
}