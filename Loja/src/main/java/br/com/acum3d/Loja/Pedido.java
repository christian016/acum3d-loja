package br.com.acum3d.Loja;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomeCliente;
    private String email;
    private String endereco;
    private String formaPagamento;
    private double total;

    // Construtor vazio obrigatório para o Banco de Dados
    public Pedido() {
    }

    // Getters para o Spring conseguir ler e transformar em JSON
    public Long getId() { return id; }
    public String getNomeCliente() { return nomeCliente; }
    public String getEmail() { return email; }
    public String getEndereco() { return endereco; }
    public String getFormaPagamento() { return formaPagamento; }
    public double getTotal() { return total; }

    // Setters para o Spring conseguir gravar os dados que chegam do site
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
    public void setEmail(String email) { this.email = email; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }
    public void setTotal(double total) { this.total = total; }
}