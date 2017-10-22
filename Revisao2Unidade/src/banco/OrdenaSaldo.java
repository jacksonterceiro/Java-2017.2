package banco;

import java.util.Comparator;

/**
 * 
 * @author Jackson Terceiro
 * @date 22 de out de 2017
 * @time 18:41:39
 *
 */
public class OrdenaSaldo implements Comparator<Conta>{

	@Override
	public int compare(Conta conta1, Conta conta2) {
		if(conta1.getNumConta().compareTo(conta2.getNumConta()) > 0) return 1;
		if(conta1.getNumConta().compareTo(conta2.getNumConta()) < 0) return -1;
		return 0;
	}

}
