package banco;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Esta classe devera manter um cadastro de contas e clientes associados.
 * Um cliente pode ter mais de uma conta, mas uma conta e unica no banco e pertence a um unico cliente.
 */
public class Banco {
	TreeMap<Conta, Cliente> contas; //Um cliente pode ter mais de uma conta, mas uma conta e unica no banco e pertence a um unico cliente.
	
	public Banco(){
		super();
		this.contas = new TreeMap<Conta, Cliente> ();
	}
	
	public void inserir(Conta conta, Cliente cliente){
		this.contas.put(conta, cliente);
	}
	
	public Conta buscaConta(String numero){
		
		Set<Entry<Conta, Cliente>> set = this.contas.entrySet();
		Iterator<Entry<Conta, Cliente>> iterator = set.iterator();
		
		while(iterator.hasNext()){
	        Map.Entry<Conta, Cliente> mentry = (Map.Entry<Conta, Cliente>)iterator.next();
	        if(mentry.getKey().getNumConta().compareTo(numero) == 0) return mentry.getKey();
		}
		return null;
	}
	
	public Cliente buscaCliente(String cpf){
		Set<Entry<Conta, Cliente>> set = this.contas.entrySet();
		Iterator<Entry<Conta, Cliente>> iterator = set.iterator();
		
		while(iterator.hasNext()){
	        Map.Entry<Conta, Cliente> mentry = (Map.Entry<Conta, Cliente>)iterator.next();
	        if(mentry.getValue().getCpf().compareTo(cpf) == 0) return mentry.getValue();
		}
		return null;
	}
	
	public List<Conta> buscaContasDeUmCliente(String cpf){
		List<Conta> contasCliente = new ArrayList<Conta> ();
		
		Set<Entry<Conta, Cliente>> set = this.contas.entrySet();
		Iterator<Entry<Conta, Cliente>> iterator = set.iterator();
		
		while(iterator.hasNext()){
			Map.Entry<Conta, Cliente> mentry = (Map.Entry<Conta, Cliente>)iterator.next();
			if(mentry.getValue().getCpf().compareTo(cpf) == 0) contasCliente.add(mentry.getKey());
		}
		
		return contasCliente;
	}
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		Conta conta = new Conta("1452");
		Cliente cliente = new Cliente("Jackson", "12345678912");
		conta.creditar(50, new Date());
		banco.inserir(conta, cliente);
		
		banco.buscaConta("1452");
		
		
	}
}
