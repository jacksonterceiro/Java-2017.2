package banco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Jackson Terceiro
 * @date 22 de out de 2017
 * @time 18:41:29
 *
 */
public class Conta implements Comparable<Conta>{
	String numero;
	List<Lancamento> lancamentos;

	public Conta() {
		super();
		lancamentos = new ArrayList<Lancamento>();
	}

	public Conta(String numero) {
		this();
		this.numero = numero;
	}

	public Conta(String numero, List<Lancamento> lancamentos) {
		this();
		this.numero = numero;
		this.lancamentos = lancamentos;
	}

	@Override
	public int compareTo(Conta o) {
		if(this.numero.compareTo(o.getNumConta()) > 0) return 1;
		if(this.numero.compareTo(o.getNumConta()) < 0) return -1;
		return 0;
	}

	@Override
	public String toString() {
		String retorno = ("Numero da Conta: " + this.numero + "\nLancamentos:\n");
		for (Lancamento lancamento : this.lancamentos) {
			retorno += "\t" + lancamento.toString() + "\n";
		}
		return (retorno);
	}

	public String getNumConta() {
		return numero;
	}

	public void setNumConta(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		float saldoTotal = 0;
		for (Lancamento lancamento : this.lancamentos) {
			saldoTotal += lancamento.getValor();
		}
		return saldoTotal;
	}

	public void debitar(float valor, Date data) { // Valor negativo
		this.lancamentos.add(new Lancamento(-valor, data));
	}

	public void creditar(float valor, Date data) {
		this.lancamentos.add(new Lancamento(valor, data));
	}

	public static void main(String[] args) {
		Conta conta = new Conta("1234");
		conta.debitar(50, new Date());

		System.out.println(conta.getSaldo());
	}
}
