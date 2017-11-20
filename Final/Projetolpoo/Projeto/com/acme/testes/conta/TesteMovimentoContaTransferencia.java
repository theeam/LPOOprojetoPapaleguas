//OK 19/11 09:50
package com.acme.testes.conta;

import java.util.Date;
import java.util.Scanner;

import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;
import com.acme.rn.conta.MovimentoContaTransferencia;

public class TesteMovimentoContaTransferencia {

	public static void main(String[] args) throws Exception {
		int valor; // Declaracao de atributos do tipo inteiro
		String nomeFonte; // Declaracao do atributo do tipo cadeia de caracteres
		Date data = new Date(); // Inicializacao do atributo do tipo data
		Cpf cpf = new Cpf("11144477735"); // Inicializacao do atributo do tipo
											// cpf
		Cliente c = new Cliente(cpf, "Son \"Kakaroto\" Goku", 96969, 25, 1); // Inicializacao
																				// do
																				// atributo
																				// do
																				// tipo
																				// cliente
		IdentificadorConta idc = new IdentificadorConta(99); // Inicializacao do
																// atributo do
																// tipo
																// identificadorConta

		ContaMilhagem cmO = new ContaMilhagem(idc, c); // Inicializacao do
														// atributo do tipo
														// ContaMilhagem
		ContaMilhagem cmD = new ContaMilhagem(idc, c); // Inicializacao do
														// atributo do tipo
														// ContaMilhagem

		Scanner sc = new Scanner(System.in); // Inicializacao do scanner

		System.out.println("Insira o valor: "); // Imprimi mensagem na tela
		valor = sc.nextInt(); // Atribui ao atributo o proximo inteiro digitado
		System.out.println("Insira o nome da fonte: "); // Imprimi mensagem na
														// tela
		nomeFonte = sc.next(); // Atribui ao atributo a proxima cadeia de
								// caracteres digitada
		cmO.creditar(valor + 250); //Credita o valor a conta
		cmO.transferir(valor, cmD); //Transfere o valor da conta Origem a conta Destino

		MovimentoContaTransferencia mct = new MovimentoContaTransferencia(cmO, cmD, valor, nomeFonte, data); // Inicializacao
		// do
		// atributo
		// do
		// tipo
		// MovimentoConta

		mct.setContaDestino(cmD); // Metodo para atribuir conta Destino
		mct.getContaDestino(); // Metodo para receber conta destino
		System.out.println(mct.toString() + "\n" + mct.getNomeExtrato()); // Imprimi
																			// na
																			// tela
																			// as
																			// informacoes
																			// do
																			// movimentoConta
		sc.close(); // Fecha o scanner

		System.out.println("\nChave:" + mct.getChave()); // Retorna o valor da
															// chave do
		// movimento conta
	}

}
