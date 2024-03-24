package dev.akash.BookMyShow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication //(exclude = {SecurityAutoConfiguration.class}) sir ke isme issue aa rha
// tha extra check hai spring security mai isliye mere mai working fine that why commented
public class BookMyShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

}
