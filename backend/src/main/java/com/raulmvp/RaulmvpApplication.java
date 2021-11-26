package com.raulmvp;

import com.raulmvp.service.CompetitionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RaulmvpApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaulmvpApplication.class, args);

		CompetitionService competitionService = new CompetitionService();
		competitionService.createCompetition();
	}

}
