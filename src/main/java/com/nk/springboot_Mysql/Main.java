package com.nk.springboot_Mysql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {
	private final CustomerRepository customerRepository;

	public Main(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		System.out.println("Hi_____________---------");
		SpringApplication.run(Main.class, args);
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
