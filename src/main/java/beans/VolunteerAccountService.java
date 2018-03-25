package beans;

public interface VolunteerAccountService {
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount);
	public void depositMoney(long accountId, double amount) throws Exception;
	public VolunteerAccount getAccount(long accountId);

}
