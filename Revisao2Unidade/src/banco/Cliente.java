package banco;

/**
 * 
 * @author Jackson Terceiro
 * @date 22 de out de 2017
 * @time 18:41:22
 *
 */
public class Cliente {
	String nome;
	String cpf;
	
	
	public Cliente(){
		super();
	}
	
	public Cliente(String nome, String cpf){
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString(){
		return ("Nome: " + this.nome + ", Cpf: " + this.cpf);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
