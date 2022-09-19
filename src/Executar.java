
public class Executar {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.setNome("Rafael Gomes");
		
		Conta cc = new ContaCorrente(paulo);
		cc.depositar(15.5);
						
		Conta poupanca = new ContaPoupanca(paulo);
		cc.transferir(10, poupanca);
		
		Conta investimentos = new Investimentos(paulo);
		investimentos.depositar(1500);
			
		cc.imprimirExtrato();
		poupanca.imprimirExtrato(); 
		investimentos.imprimirExtrato();
		
	}

}
