package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("insira os dados do produto:");
		
		System.out.print("nome do produto: ");
		produto.nome = sc.next();
		System.out.print("preço do produto: ");
		produto.preco = sc.nextDouble();
		System.out.print("quantidade do produto: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("dados do produto: " + produto);		
		
		System.out.println();
		System.out.println("insira o numero da quantidade de produtos para ser adicionado no estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("atualização dos dados do produto: " + produto);		
		
		System.out.println();
		System.out.println("insira o numero da quantidade de produtos para ser removido no estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("atualização dos dados do produto: " + produto);	
		
		
		
		sc.close();

	}

}
