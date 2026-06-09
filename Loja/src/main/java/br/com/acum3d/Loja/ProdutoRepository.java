package br.com.acum3d.Loja;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Esta etiqueta avisa ao Spring que esta interface cuida do banco de dados
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Sim, o código fica totalmente vazio! 
    // O JpaRepository já traz todos os comandos prontos nos bastidores.
}