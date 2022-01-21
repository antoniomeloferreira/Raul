package com.raulmvp;

import com.raulmvp.dao.TeamDao;
import com.raulmvp.dao.UniverseDao;
import com.raulmvp.entity.TeamEntity;
import com.raulmvp.model.Team;
import com.raulmvp.model.Universe;
import com.raulmvp.service.CompetitionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RaulmvpApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaulmvpApplication.class, args);

	}

}
