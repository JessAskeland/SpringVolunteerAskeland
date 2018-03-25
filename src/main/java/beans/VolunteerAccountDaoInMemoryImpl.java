package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VolunteerAccountDaoInMemoryImpl implements VolunteerAccountDao{
	private Map<Long,VolunteerAccount> volunteerAccountsMap = new HashMap<Long, VolunteerAccount>();
	{
		VolunteerAccount account1 = new VolunteerAccount(1L, "Jessie", 100);
		VolunteerAccount account2 = new VolunteerAccount(2L, "Brad", 75);
		
		volunteerAccountsMap.put(account1.getId(), account1);
		volunteerAccountsMap.put(account2.getId(), account2);
	}
	
	public void insert(VolunteerAccount volunteerAccount) {
		// TODO Auto-generated method stub
		volunteerAccountsMap.put(volunteerAccount.getId(), volunteerAccount);
		
	}
	public void update(VolunteerAccount volunteerAccount) {
		// TODO Auto-generated method stub
		volunteerAccountsMap.put(volunteerAccount.getId(), volunteerAccount);
		
	}
	public void update(List<VolunteerAccount> VolunteerAccounts) {
		// TODO Auto-generated method stub
		for(VolunteerAccount volunteerAccount: VolunteerAccounts) {
			update(volunteerAccount);
		}
	}
	public void delete(long volunteerAccountId) {
		// TODO Auto-generated method stub
		volunteerAccountsMap.remove(volunteerAccountId);
		
	}
	public VolunteerAccount find(long volunteerAccountId) {
		// TODO Auto-generated method stub
		return volunteerAccountsMap.get(volunteerAccountId);
	}
	public List<VolunteerAccount> find(List<Long> volunteerAccountIds) {
		// TODO Auto-generated method stub
		List<VolunteerAccount> accounts = new ArrayList<VolunteerAccount>();
		for(Long id: volunteerAccountIds) {
			accounts.add(volunteerAccountsMap.get(id));
		}
		return accounts;
	}
	public List<VolunteerAccount> find(String volunteerName) {
		// TODO Auto-generated method stub
		List<VolunteerAccount> accounts = new ArrayList<VolunteerAccount>();
		for(VolunteerAccount account: volunteerAccountsMap.values()) {
			if(volunteerName.equals(account.getVolunteerName())){
				accounts.add(account);
			}
		}
		return accounts;
	}
	public List<VolunteerAccount> find(boolean locked) {
		// TODO Auto-generated method stub
		List<VolunteerAccount> accounts = new ArrayList<VolunteerAccount>();
		for(VolunteerAccount account: volunteerAccountsMap.values()) {
			if(locked == (account.isLocked())) {
				accounts.add(account);
			}
		}
		return accounts;
	}
}
