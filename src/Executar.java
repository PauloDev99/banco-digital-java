
public class Executar {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Henrique");
		
		Conta cc = new ContaCorrente(paulo);
		cc.depositar(1100);
						
		Conta poupanca = new ContaPoupanca(paulo);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato(); 

	}

}
