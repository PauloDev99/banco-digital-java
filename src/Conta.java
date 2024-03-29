
public abstract class Conta implements IConta  {
	
	private static final int AGENCIA_PADRA0 = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected double investimento;
	
	
	
	  public Conta(Cliente cliente) {
		
	  this.agencia = Conta.AGENCIA_PADRA0;
	  this.numero = SEQUENCIAL++;
	  this.cliente = cliente;
	}

	
	@Override
	public void sacar(double valor) {
		saldo = saldo - valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo = saldo + valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	
	    public double getInvestimento() {
		return investimento;
	  }
	    
	   

		protected void imprimirInfosComuns() {
	    System.out.println(String.format("Titular: %s", this.cliente.getNome()));	
		System.out.println(String.format("Ag�ncia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("");
		
	}
	
	
    

}
