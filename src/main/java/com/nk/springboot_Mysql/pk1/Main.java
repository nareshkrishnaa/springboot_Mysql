package com.nk.springboot_Mysql.pk1;

import com.nk.springboot_Mysql.pk2.Dependency3;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = "com.nk.springboot_Mysql")
public class Main implements CommandLineRunner {
	private final CustomerRepository customerRepository;

	public Main(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
		Dependency3 d3 = context.getBean(Dependency3.class);
		d3.show();
		System.out.println(context.containsBean("bean3"));
		Name nk = context.getBean(Name.class);
		System.out.println(nk.getName());
		PizzaController pc = context.getBean(PizzaController.class);
		System.out.println(pc.getPizza());




	}


	@Override
	public void run(String... args) throws Exception {
		try {

			List<Customer> customers = customerRepository.findAll();

			for (Customer customer : customers) {

				System.out.println(customer.getName() + " "+ customer.getEmail());
			}
		} catch (Exception e) {
			throw new Exception("Error occurred while bla bla bla running the application", e);
		}
	}
}
/*Notes
 * Types of injection/ ways for creating beans. Field injection / constructor injection / get bean
 * component scan annotation @ComponentScan(basePackages = "com.aymar.springdemo.pkg2")
 * Bean name conflict resolution
 */