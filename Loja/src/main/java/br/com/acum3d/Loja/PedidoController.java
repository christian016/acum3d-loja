package br.com.acum3d.Loja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    // Rota para o site ENVIAR um novo pedido (Checkout)
    @PostMapping("/pedidos")
    public Pedido receberPedido(@RequestBody Pedido novoPedido) {
        System.out.println("Nova venda realizada para: " + novoPedido.getNomeCliente());
        System.out.println("Valor Total: R$ " + novoPedido.getTotal());
        
        // Salva definitivamente no PostgreSQL
        return repository.save(novoPedido);
    }

    // Rota para você VER todos os pedidos depois (Painel Admin)
    @GetMapping("/pedidos")
    public List<Pedido> listarPedidos() {
        return repository.findAll();
    }
}