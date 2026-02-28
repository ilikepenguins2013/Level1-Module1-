package _06_vault;

public class VaultRunner {

	public static void main(String[] args) {
		for(int i = 0 ; i < 100000; i++) {
		Vault vault = new Vault();
		SecretAgent bob = new SecretAgent();
		int answer = bob.findCode(vault);
		if(answer != -1 && answer == 789003) {
			System.out.println("the code is " + answer);
		}
		
		}
	}
}
