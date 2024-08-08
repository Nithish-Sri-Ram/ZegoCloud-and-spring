package com.nithish.videocall;

import com.nithish.videocall.user.User;
import com.nithish.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service){
		return args -> {
			service.register(User.builder()
							.username("Nithish")
							.email("nithish@gmail.com")
							.password("nnn")
					.build());service.register(User.builder()
							.username("Samyu")
							.email("samyu@gmail.com")
							.password("sss")
					.build());service.register(User.builder()
							.username("Thangam")
							.email("thangam@gmail.com")
							.password("ttt")
					.build());
		};
	}
}
