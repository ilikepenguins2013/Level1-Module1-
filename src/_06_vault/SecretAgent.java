package _06_vault;

public class SecretAgent {
	public int findCode(Vault something) {
		for(int oi = 0; oi < 1000001; oi++) {
			boolean bob = something.tryCode(oi);
			if(bob == true) {
				return oi;
			}
		}
		return -1;
	}
}
