package com.tokenManagement;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TokenManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TokenManagementApplication.class, args);
		
		 
//		 LocalDateTime now = LocalDateTime.now();
//		 System.out.println("now : "  + now);
//		 
//		 LocalDateTime newTime = LocalDateTime.now().plusMinutes(10);
//		 
//		 long duration = Duration.between(now, newTime).toMillis();
//		 long minutes = TimeUnit.MILLISECONDS.toMinutes(duration)*60;
//		 
//		
//		 String time = String.format("%02d hours, %02d min, %02d sec",
//	                TimeUnit.MILLISECONDS.toHours(duration),
//	                TimeUnit.MILLISECONDS.toMinutes(duration) -  TimeUnit.MILLISECONDS.toHours(duration) * 60,
//	                TimeUnit.MILLISECONDS.toSeconds(duration) - minutes);                ;
//	        System.out.println("time = " + time);
		 
		 
	//	 System.out.println("Duration : " + duration);
		 
//		 LocalDateTime tempDateTime = LocalDateTime.from(now);
//		 
//		 long hours = tempDateTime.until( newTime, ChronoUnit.HOURS );
//		 tempDateTime = tempDateTime.plusHours( hours );
//
//		 long minutes = tempDateTime.until( newTime, ChronoUnit.MINUTES );
//		 tempDateTime = tempDateTime.plusMinutes( minutes );
//
//		 long seconds = tempDateTime.until( newTime, ChronoUnit.SECONDS );
//		 
//		 System.out.println(
//			        hours + " hours " +
//			        minutes + " minutes " +
//			        seconds + " seconds.");
//

		
		 
	//	long hours = ChronoUnit.HOURS.between(now, newTime);
		
	//	long minutes = ChronoUnit.MINUTES.between(now, newTime);
		 
	//	 long seconds = ChronoUnit.SECONDS.between(newTime, tempDateTime);
		 
//		 
	//	System.out.println("between time in hours and minutes : " + hours+"h"+minutes+"m");
		
	}

}
