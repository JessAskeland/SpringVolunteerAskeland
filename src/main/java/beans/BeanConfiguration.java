package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public VolunteerAccountDao accountDao() {
		VolunteerAccountDaoInMemoryImpl bean = new VolunteerAccountDaoInMemoryImpl();
		return bean;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public VolunteerAccountService accountService() {
		VolunteerAccountServiceImpl bean = new VolunteerAccountServiceImpl(accountDao());
		//bean.setAccountDao(accountDao());
		return bean;
	}
	
	//@Bean
	//public VolunteerAccountDao VolunteerAccountDaoJpa() {
	//	VolunteerAccountDaoJpaImpl bean = new VolunteerAccountDaoJpaImpl();
	//	return bean;
	//}

}
