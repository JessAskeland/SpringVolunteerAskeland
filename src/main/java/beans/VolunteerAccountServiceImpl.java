package beans;

public class VolunteerAccountServiceImpl implements VolunteerAccountService {
	
	//private VolunteerAccountDao accountDao;
	private VolunteerAccountDao volunteerAccountDao;
	
	public VolunteerAccountServiceImpl(VolunteerAccountDao volunteerAccountDao) {
		this.volunteerAccountDao = volunteerAccountDao;
	}
	
	public VolunteerAccountDao getVolunteerAccountDao() {
		return volunteerAccountDao;
	}
	
	public void setVolunteerAccountDao(VolunteerAccountDao volunteerAccountDao) {
		this.volunteerAccountDao = volunteerAccountDao;
	}	

	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		// TODO Auto-generated method stub
		VolunteerAccount sourceAccount = volunteerAccountDao.find(sourceAccountId);
		VolunteerAccount targetAccount = volunteerAccountDao.find(targetAccountId);
		
		sourceAccount.setHourBalance(sourceAccount.getHourBalance() - amount);
		targetAccount.setHourBalance(targetAccount.getHourBalance() + amount);
		
		volunteerAccountDao.update(sourceAccount);
		volunteerAccountDao.update(targetAccount);
		
	}

	public void depositMoney(long accountId, double amount) throws Exception {
		// TODO Auto-generated method stub
		VolunteerAccount account = volunteerAccountDao.find(accountId);
		account.setHourBalance(account.getHourBalance() + amount);
		volunteerAccountDao.update(account);
		
	}

	public VolunteerAccount getAccount(long accountId) {
		// TODO Auto-generated method stub
		return volunteerAccountDao.find(accountId);
	}

}
