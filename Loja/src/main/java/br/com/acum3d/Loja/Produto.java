package br.com.acum3d.Loja;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Essa etiqueta diz: "Java, transforme isso numa tabela no PostgreSQL!"
@Entity
public class Produto {

    // Essa etiqueta diz: "Isso é a chave primária, gere o número automaticamente!"
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private double preco;
    
    // Como a nossa imagem Base64 é um texto muito grande, precisamos avisar o banco:
    @Column(columnDefinition = "TEXT")
    private String imagem;

    // OBRIGATÓRIO: O banco de dados exige um construtor completamente vazio para trabalhar
    public Produto() {
    }

    // O nosso construtor normal
    public Produto(Long id, String nome, double preco, String imagem) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public String getImagem() { return imagem; }

    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setImagem(String imagem) { this.imagem = imagem; }
}