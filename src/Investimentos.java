
    public class Investimentos extends Conta {
	
	
	public Investimentos(Cliente cliente) {
			super(cliente);
			
		}

		
	@Override
	public void imprimirExtrato() {
		System.out.println("===== Extrato Meus Investimentos  =====");
		super.imprimirInfosComuns();
		
	}
	

}
