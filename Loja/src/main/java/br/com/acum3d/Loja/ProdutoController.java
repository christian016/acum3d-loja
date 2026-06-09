package br.com.acum3d.Loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") 
public class ProdutoController {

    // A etiqueta @Autowired pede para o Spring Boot conectar o nosso Repositório aqui
    @Autowired
    private ProdutoRepository repository;

    // 1. BUSCAR TODOS (GET): Puxa direto do banco de dados
    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        return repository.findAll(); // O comando findAll() faz um "SELECT" automático no banco
    }

    // 2. CADASTRAR NOVO (POST): Salva definitivamente no banco
    @PostMapping("/produtos")
    public Produto cadastrarProduto(@RequestBody Produto novoProduto) {
        // Como configuramos o ID como automático lá na entidade, 
        // o banco de dados vai gerar o número correto sozinho!
        return repository.save(novoProduto); // O comando save() insere o registro no banco
    }

    // 3. EDITAR (PUT): Atualiza os dados de um ID existente
    @PutMapping("/produtos/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produtoEditado) {
        // Buscamos o produto pelo ID. Se achar, atualizamos os dados e salvamos.
        return repository.findById(id).map(p -> {
            p.setNome(produtoEditado.getNome());
            p.setPreco(produtoEditado.getPreco());
            p.setImagem(produtoEditado.getImagem());
            return repository.save(p);
        }).orElse(null);
    }

    // 4. EXCLUIR (DELETE): Apaga o registro com base no ID
    @DeleteMapping("/produtos/{id}")
    public String excluirProduto(@PathVariable Long id) {
        repository.deleteById(id); // Deleta direto da tabela por ID
        return "Produto removido com sucesso!";
    }
}