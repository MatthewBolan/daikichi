package com.codingdojo.daikichi;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController

public class DaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
	}
	
    // 1. Annotation
	
    @RequestMapping("/daikichi")
    
    // 3. Method that maps to the request route above
    
    public String welcome() { // 3
    	
            return "Welcome!";
            
    }

 // 1. Annotation
    
    @RequestMapping("/daikichi/today")
    
    // 3. Method that maps to the request route above
    
    public String todaysluck() { // 3
    	
            return "Today you will find luck in all your endeavors!!";
            
    }
 
    // 1. Annotation
    
    @RequestMapping("/daikichi/tomorrow")
    
    // 3. Method that maps to the request route above
    
    public String tomorrow() { // 3
    	
            return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
            
    }
    
    
    @RequestMapping("/daikichi/travel/{city}")
    
    // 3. Method that maps to the request route above
    
    public String showcity(@PathVariable ("city") String city) {
    	
            return "Congratulations! You will soon travel to " + city + "!";
            
    }
    
    @RequestMapping("/daikichi/lotto/{number}")
    
    // 3. Method that maps to the request route above
    
    public String showlottonumber(@PathVariable ("number") int number) {
    	
    	if (number % 2 == 0 ) {
    		
    		return "You will take a grand journey in the near future, but be weary of tempting offers.";
    		
    	}
    	
    	else {
    		
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    		
    	}
                    
    }
    
    
}
