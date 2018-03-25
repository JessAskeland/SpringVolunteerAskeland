package beans;

import java.util.List;

public interface VolunteerAccountDao {
	
	public void insert(VolunteerAccount volunteerAccount);
	public void update(VolunteerAccount volunteerAccount);
	public void update(List<VolunteerAccount> VolunteerAccounts);
	public void delete(long volunteerAccountId);
	public VolunteerAccount find(long volunteerAccountId);
	public List<VolunteerAccount> find(List<Long> volunteerAccountIds);
	public List<VolunteerAccount> find(String volunteerName);
	public List<VolunteerAccount> find(boolean locked);

}
