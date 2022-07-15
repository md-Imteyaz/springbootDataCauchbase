package com.SpringbootCouchbase;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringbootCouchbase.Model.Customer;
import com.SpringbootCouchbase.Repository.CustomerRepo;

@SpringBootApplication
@RestController("/api")
public class SpringdataCouchbaseApplication {

	@Autowired(required=false)
	private CustomerRepo customerrepo;

	//@PostConstruct
	public void initCustomerRepo() {
		customerrepo.saveAll(Stream.of(new Customer(111, "rehan", new String[] { "okhla", "delhi" }),
				new Customer(222, "roqiyah", new String[] { "bihar", "darbhanga" })).collect(Collectors.toList()));
	}

	@GetMapping("/FetchAll")
	public Iterable<Customer> getAll() {
		return customerrepo.findAll();

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdataCouchbaseApplication.class, args);

	}

}
