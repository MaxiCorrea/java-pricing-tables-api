package com.maxicorrea.javapricingtablesapi;

import java.net.URISyntaxException;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * 
 * @author mxcorrea
 *
 */
@Configuration
@SpringBootApplication
public class JavaPricingTablesApiApplication {

  @Value("${spring.datasource.url}")
  private String dbUrl;
 
  public static void main(String[] args) {
    SpringApplication.run(JavaPricingTablesApiApplication.class, args);
  }

  @Bean
  public JdbcTemplate jdbcTemplate() throws SQLException, URISyntaxException {
    return new JdbcTemplate(dataSource());
  }

  @Bean
  public HikariDataSource dataSource() throws URISyntaxException {
    HikariConfig config = new HikariConfig();
    config.setJdbcUrl(dbUrl);
    return new HikariDataSource(config);
  }

}
