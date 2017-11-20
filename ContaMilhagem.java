package com.acme.rn.conta;

import com.acme.rn.cliente.Cliente;

public class ContaMilhagem {

	private IdentificadorConta identificador; // Declaracao dos atributos
	private Cliente cliente;
	private int saldo;
	private boolean ativo = false;

	public IdentificadorConta getIdentificadorConta() { // Metodo para retornar
														// o identificador da
														// conta
		return identificador;
	}

	public boolean getStatus() { // Metodo para retornar o status da conta
		return ativo;
	}

	public int getSaldo() { // Metodo para retornar o saldo
		return saldo;
	}

	public Cliente getCliente() { // Metodo para retornar o cliente
		return cliente;
	}

	public void setSaldo(int valor) {// Metodo para atribuir saldo
		this.saldo = valor;
	}

	public void setCliente(Cliente cliente) {// Metodo para atribuir cliente
		this.cliente = cliente;
	}

	public void setIdentificadorConta(IdentificadorConta id) {// Metodo para
																// atribuir
																// identificador
																// conta
		this.identificador = id;
	}

	public void creditar(int valor) { // Metodo para creditar um valor
		if (valor > 0) // Verifica se o valor e positivo
			this.saldo += valor;// Se for maior entao credita
	}

	public void debitar(int valor) { // Metodo para debitar um valor
		if (this.saldo > valor && valor > 0) // Verifica se o saldo permite o
												// debito
			this.saldo -= valor;// Se permitir entao debita
	}

	public void transferir(int valor, ContaMilhagem conta) { // Metodo para
																// transferir um
																// valor de uma
																// para outra
																// conta
		if (conta.ativo == true) { // Verifica o status da conta
			this.debitar(valor); // Debita o valor da conta de origem
			conta.creditar(valor); // Credita o valor a conta de destino
		} else {// Se nao estivr ativa
			System.out.println("Conta desativada, nao e possivel transferir.");// Imprimir
																				// mensagem
																				// de
																				// erro
		}
	}

	public void desativar() { // Metodo para desativar conta
		if (ativo == true) // Verifica se a conta esta ativa
			this.ativo = false;// Se estiver entao desativa
	}

	public void reativar() { // Metodo para reativar conta
		if (ativo == false) // Verifica se a conta esta desativada
			this.ativo = true;// Se estiver entao ativa
	}

	public ContaMilhagem(IdentificadorConta id, Cliente cliente) { // Construtor
																	// para
																	// inicializar
																	// os
																	// atributos
		setIdentificadorConta(id); // Atribui os valor recebidos aos atributos
		setCliente(cliente);
		setSaldo(0);// Inicializa a conta com saldo 0
		reativar();// Inicializa a conta como ativa
	}

	public String toString() { // Metodo que altera o tipo original para o tipo
								// cadeia de caracteres
		return this.getCliente().toString() + "Saldo: " + this.getSaldo() + "\n" + "Identificador: "
				+ identificador.getIdentificadorConta() + "\n" + "Ativo: " + this.getStatus() + "\n";
	}

	public boolean equals(Object o) {// Metodo para comparar dois objetos
		boolean r = false;// Inicializa com o valor logico falso
		if (o instanceof ContaMilhagem) {// Verifica se o objeto e do tipo
											// ContaMilhgem
			r = this.getIdentificadorConta().equals(((ContaMilhagem) o).getIdentificadorConta());// Compara
																									// dois
																									// objetos
																									// caso
																									// sejam
																									// iguais
																									// atribui
																									// o
																									// valor
																									// logico
																									// verdadeiro
		}
		return r;// Retorna o valor logico
	}

}
