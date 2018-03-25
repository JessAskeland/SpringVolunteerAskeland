package beans;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VolunteerStartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AnnotationConfigApplicationContext applicationContext = new
		//AnnotationConfigApplicationContext(BeanConfiguration.class);
				
		ClassPathXmlApplicationContext applicationContext = new
		ClassPathXmlApplicationContext("beans/beans.xml");
				
		VolunteerAccountService volunteerAccountService = applicationContext.getBean("volunteerAccountService", VolunteerAccountService.class);
				
		System.out.println("Before volunteer money transfer");
		System.out.println("Volunteer Account 1 Balance: " +volunteerAccountService.getAccount(1).getHourBalance());
		System.out.println("Volunteer Account 2 Balance: " +volunteerAccountService.getAccount(2).getHourBalance());
				
		volunteerAccountService.transferMoney(1, 2, 5);
				
		System.out.println("Before volunteer money transfer");
		System.out.println("Volunteer Account 1 Balance: " +volunteerAccountService.getAccount(1).getHourBalance());
		System.out.println("Volunteer Account 2 Balance: " +volunteerAccountService.getAccount(2).getHourBalance());

	}

}
