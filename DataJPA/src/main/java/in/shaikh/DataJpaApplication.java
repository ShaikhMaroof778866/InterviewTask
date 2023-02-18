package in.shaikh;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shaikh.dao.UserRepository;
import in.shaikh.entities.User;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		// Save Operation
//		User user1= new User();
//		user1.setFirstName("Raj");
//		user1.setLastName("Verma");
//		user1.setEmail("raj.verma@imagine.com");
//		user1.setAge(35);
//		
//		
//		User user2= new User();
//		user2.setFirstName("vaibhav");
//		user2.setLastName("Telang");
//		user2.setEmail("v.Teang@futureready.com");
//		user2.setAge(29);
//		
//		User user3= new User();
//		user3.setFirstName("Ketan");
//		user3.setLastName("Bhadur");
//		user3.setEmail("k.bahadur@infonext.com");
//		user3.setAge(32);
//		
//		User user4= new User();
//		user4.setFirstName("Abhishek");
//		user4.setLastName("Raj");
//		user4.setEmail("abhi.raj@softsol.com");
//		user4.setAge(30);
//		
		// saveAll method()
		
//		List<User> u = Arrays.asList(user1,user2, user3, user4);
//		userRepository.saveAll(u);
		
//		System.out.println("Record Inserted into the table.........");
		
		// Reading the user details whose id is 4 and updating it
		
		 Optional<User> optional = userRepository.findById(1);
		 
		 User user = optional.get(); // reading the data
		 // we can also use another method as findById
		 user.setFirstName("Shaikh");// updating the data 
		 user.setLastName("Maroof");
		 user.setEmail("shaikh.maroof@saksoft.com");
		 user.setAge(25);
		 userRepository.save(user);
//		 userRepository.delete(1); // Deleting the user
		 
		 System.out.println(user);
		 
		
		
	}

}
