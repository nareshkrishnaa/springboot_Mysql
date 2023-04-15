package com.nk.springboot_Mysql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {
	private final CustomerRepository customerRepository;

	public Main(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
		Dependency3 d3 = context.getBean(Dependency3.class);
		d3.show();


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