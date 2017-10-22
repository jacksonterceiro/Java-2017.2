package banco;

import java.util.Date;

/**
 * 
 * @author Jackson Terceiro
 * @date 22 de out de 2017
 * @time 18:41:34
 *
 */
public class Lancamento {
	float valor;
	Date data;
	
	public Lancamento(){}
	
	public Lancamento(float valor, Date data){
		super();
		this.valor = valor;
		this.data = data;
	}
	
	@Override
	public String toString(){
		return ("Valor: " + this.valor + ", Data: " + this.data);
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
