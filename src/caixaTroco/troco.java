package caixaTroco;
import java.util.Scanner;

public class troco {
	public static void main(String[] args) {	
		
		//bloco de entrada de texto campo valor produto
		Scanner valorProduto = new Scanner (System.in);
		//bloco de entrada de texto campo valor pago
		Scanner valorPago = new Scanner (System.in);
		
		//entrada do valor do produto
		System.out.println("Valor do produto:");
		//atribuição do valor inserido com a variavel 
		int valorDoProduto = valorProduto.nextInt();
		//entrada do valor do pago
		System.out.println("Valor pago:");
		//atribuição do valor inserido com a variavel 
		int  valorDoPagamento = valorPago.nextInt();
		
		int valorTroco;
		// valor do troco é igual ao valor pago menos ao valor do produto
		valorTroco =  valorDoPagamento - valorDoProduto;	
		//retorno do valor do troco
		System.out.println( "Valor do troco: " +valorTroco+"");
	}
}
