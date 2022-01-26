package com.example.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created a Product Model having id,name,price and quantity.
 * A product can be added,deleted and updated.
 * @author Neeraj Kashyap
 * @since 26/01/2022
 * @version 1.0
 */
@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

}
