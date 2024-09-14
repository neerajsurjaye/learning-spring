package com.spec.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class BooksApiApplication implements CommandLineRunner {

	private final DataSource dataSource;

	public BooksApiApplication(final DataSource dataSource){
		this.dataSource = dataSource;
	}

	private static final Logger log = LoggerFactory.getLogger(BooksApiApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BooksApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Info : " + dataSource.toString());
		JdbcTemplate testTemplte = new JdbcTemplate(dataSource);
		testTemplte.execute("select 1");

	}
}
