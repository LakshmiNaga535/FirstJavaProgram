
public class JuniorSavingsAccount extends SavingsAccount{

	String GaurdianName;
	
	public JuniorSavingsAccount(int AcctNo, float Bal, String Type, String gaurdianName) {
		super(AcctNo, Bal, Type);
		GaurdianName = gaurdianName;
	}
}