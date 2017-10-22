package banco;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author Jackson Terceiro
 * @date 22 de out de 2017
 * @time 18:40:53
 *
 */
public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente clienteTeste;
		Conta contaTeste;
		
		Cliente cliente1 = new Cliente("Jackson", "12345678901");
		Cliente cliente2 = new Cliente("Allan", "65412354789");
		Cliente cliente3 = new Cliente("Fernando", "52136458795");
		
		Conta conta1 = new Conta("001");
		Conta conta2 = new Conta("002");
		Conta conta3 = new Conta("003");
		Conta conta4 = new Conta("004");
		Conta conta5 = new Conta("005");
		
		banco.inserir(conta1, cliente1);
		banco.inserir(conta2, cliente1);
		banco.inserir(conta3, cliente2);
		banco.inserir(conta4, cliente3);
		banco.inserir(conta5, cliente3);
		
		conta1.creditar(500, new Date());
		conta2.creditar(200, new Date());
		conta3.creditar(2000, new Date());
		conta4.debitar(100, new Date());
		conta5.debitar(1000, new Date());
		
		clienteTeste = banco.buscaCliente("12345678901");
		System.out.println(clienteTeste.toString());
		
		contaTeste = banco.buscaConta("001");
		System.out.println(contaTeste.toString());
		
		List<Conta> contasCliente = banco.buscaContasDeUmCliente("12345678901");
		System.out.println("Contas do cliente " + cliente1.getNome() + ":");
		for(Conta conta : contasCliente){
			System.out.println(conta.getNumConta());
		}
		
		

	}

}
