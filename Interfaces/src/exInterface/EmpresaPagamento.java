package exInterface;

public interface EmpresaPagamento { // interface eh um tipo mais generico de algo q sera implementado, e quando for implementado 
									// tem q ter tudo do tipo generico, obrigatoriamente
	public void tax(Contrato contrato, int parcelas);
	
}
