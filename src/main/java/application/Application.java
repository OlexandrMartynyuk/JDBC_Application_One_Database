package application;
import java.awt.EventQueue;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.interfaces.CustomerCRUD;
import dao.models.Customer;
import dao.services.CustomerCRUDImpl;




@SpringBootApplication(scanBasePackages = {"controllers"})
@Configuration
public class Application {
	
	/*@Autowired 
	private CustomerCRUD temp;
	
*/	
	
	
	
	public static void main(String[] args) {
		
			SpringApplication.run(Application.class, args);
       	}
    
	/*@RequestMapping(method = RequestMethod.GET, value = "/users")
	@ResponseBody
	public String addNewUser () {
		List<Customer> customers = temp.getAll();
		
		System.out.println(customers.toString());
		return "asd";
	}*/
    
    
    
    
    @Bean
	public CustomerCRUD getCustomerCRUDBean() {
    		
		return new CustomerCRUDImpl();
	}
    
}