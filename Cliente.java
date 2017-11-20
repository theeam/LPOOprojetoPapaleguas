package com.acme.rn.cliente;

public class Cliente {
	private String nome; // Declaracao dos atributos
	private Cpf cpf;
	private float renda;
	private int idade;
	private int sexo;
	private final int masculino = 1, feminino = 2;

	public Cliente(Cpf cpf, String nome, float renda, int idade, int sexo) { // Construtor
																				// para
																				// inicializar
																				// os
																				// atributos
		setCpf(cpf); // Atribui ao atributo o valor recebido
		setIdade(idade);
		setNome(nome);
		setRenda(renda);
		setSexo(sexo);
	}

	public String getNome() { // Metodo para receber o valor do atributo
		return nome;
	}

	public String getPrimeiroNome() { // Metodo para receber o valor do atributo
		int indice = nome.indexOf(" "); // Recebe o valor do local onde se
										// encontra a cadeia de caracteres
										// buscada
		String primeiroNome = nome.substring(0, indice); // Recebe a cadeia de
															// caracteres da
															// posicao inicial
															// ate a final,
															// ambas dadas
		return primeiroNome; // Retorna a cadeia de caracteres
	}

	public String getUltimoNome() { // Metodo para receber o valor do atributo
		int indice = nome.lastIndexOf(" "); // Recebe o valor do ultimo local
											// onde se encontra a cadeia de
											// caracteres buscada
		String ultimoNome = nome.substring(indice + 1); // Recebe a cadeia de
														// caracteres da posicao
														// inicial até a final
														// da cadeia de
														// caracteres
		return ultimoNome; // Retorna a cadeia de caracteres
	}

	public float getRenda() { // Metodo para receber o valor do atributo
		return renda;
	}

	public int getIdade() { // Metodo para receber o valor do atributo
		return idade;
	}

	public int getSexo() { // Metodo para receber o valor do atributo
		return sexo;
	}

	public Cpf getCpf() {// Metodo para receber cpf
		return cpf;
	}

	public void setCpf(Cpf cpf) {// Metodo para atribuir cpf
		this.cpf = cpf;
	}

	public void setNome(String nome) { // Metodo para atribuir valor ao atributo
		this.nome = nome;
	}

	public void setRenda(float renda) { // Metodo para atribuir valor ao
										// atributo
		this.renda = renda;
	}

	public void setIdade(int idade) { // Metodo para atribuir valor ao atributo
		this.idade = idade;
	}

	public void setSexo(int sexo) { // Metodo para atribuir valor ao atributo
		this.sexo = sexo;
	}

	public String toString() { // Metodo que altera o tipo original para o tipo
								// cadeia de caracteres
		return "Cpf: " + cpf.getCpf() + "\n" + "Nome: " + this.getNome() + "\n" + "Renda: " + this.getRenda() + "\n"
				+ "Idade: " + this.getIdade() + "\n" + "Sexo: " + this.getSexo() + "\n";
	}

	public boolean equals(Object o) { // Metodo para comparar dois objetos
		boolean r = false;// Inicializa com o valor logico falso
		if (o instanceof Cliente) {// Verifica se o objeto e do tipo cliente
			r = this.getCpf().equals(((Cliente) o).getCpf());// Compara dois
																// objetos caso
																// sejam iguais
																// atribui o
																// valor logico
																// verdadeiro
		}
		return r;// Retorna o valor logico
	}

}
