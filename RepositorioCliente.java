package com.acme.ado.cliente;

import com.acme.ado.classesGerais.IRepositorioRegistro;
import com.acme.ado.classesGerais.RepositorioRegistro;
import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;

public class RepositorioCliente {
	private IRepositorioRegistro<Cliente> repIdentificaveis; // Declaracao dos
	// atributos

	public RepositorioCliente() { // Construtor que cria um array
		repIdentificaveis = new RepositorioRegistro<Cliente>();
	}

	public void incluir(Cliente novoCliente) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente { // Metodo para incluir cliente
		repIdentificaveis.incluir(novoCliente);
	}

	public Cliente buscar(Cpf cpf) throws ExcecaoObjetoInexistente { // Metodo para buscar cliente recebendo o
										// cpf
		Cliente c = null;
		if (cpf != null) {
			c = (Cliente) repIdentificaveis.buscar(cpf.getCpf());
		}
		return c;
	}

	public boolean excluir(Cpf cpf) throws ExcecaoObjetoInexistente { // Metodo para excluir cliente recebendo
										// cpf

		if (repIdentificaveis.excluir(cpf.getCpf())) {
			return true;
		}
		return false;
	}

	public boolean alterar(Cpf antigoCliente, Cliente novoCliente)
			throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente { // Metodo
																		// para
																		// alterar
																		// dados
																		// do
																		// cliente
		if (repIdentificaveis.alterar(antigoCliente.getCpf(), novoCliente)) {
			return true;
		}

		return false;

	}

	public void buscarTodos() { // Metodo para listar todos os clientes
								// existentes no array
		repIdentificaveis.buscarTodos();
	}
}
