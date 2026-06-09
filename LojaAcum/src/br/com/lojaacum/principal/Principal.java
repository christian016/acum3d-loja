package br.com.lojaacum.principal;

// 1. Precisamos "importar" a ferramenta Scanner para dentro do projeto
import java.util.Scanner; 

public class Principal {

    public static void main(String[] args) {
        
        // 2. Criando o nosso "leitor" de teclado
        Scanner leitor = new Scanner(System.in); 
        
        System.out.println("--- PAINEL DO ADMINISTRADOR ---");
        System.out.println("Cadastrando nova luminária 3D...\n");
        
        // 3. Pedindo as informações para o ADM (Você!)
        System.out.print("Digite o nome do modelo: ");
        String nomeDigitado = leitor.nextLine(); // Fica esperando você digitar e dar Enter
        
        System.out.print("Digite o preço (use vírgula para os centavos): ");
        double precoDigitado = leitor.nextDouble();
        leitor.nextLine(); // Isso serve para limpar a quebra de linha do Enter anterior
        
        System.out.print("Qual o material (ex: PLA, PETG, ASA)? ");
        String materialDigitado = leitor.nextLine();
        
        System.out.print("Qual a impressora utilizada? ");
        String maquinaDigitada = leitor.nextLine();
        
        // 4. Aqui acontece a mágica! Usamos o Construtor passando as variáveis digitadas
        Produto luminariaCadastrada = new Produto(nomeDigitado, precoDigitado, materialDigitado, maquinaDigitada);
        
        System.out.println("\n--- PRODUTO SALVO NO ESTOQUE COM SUCESSO ---");
        System.out.println("Item: " + luminariaCadastrada.nome);
        System.out.println("Valor: R$ " + luminariaCadastrada.preco);
        
        // 5. Fechando o leitor por boas práticas
        leitor.close();
    }
}