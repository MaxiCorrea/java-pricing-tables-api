package com.maxicorrea.javapricingtablesapi;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
/**
 * 
 * @author mxcorrea
 *
 */
@SpringBootApplication
public class JavaPricingTablesApiApplication {

  @Value("${spring.datasource.url}")
  private String dbUrl;
  
  public static void main(String[] args) {
    SpringApplication.run(JavaPricingTablesApiApplication.class, args);
  }

  @Bean
  public JdbcTemplate jdbcTemplate() throws SQLException {
    return new JdbcTemplate(dataSource());
  }
  
  @Bean
  public DataSource dataSource() throws SQLException { 
    if (dbUrl == null || dbUrl.isEmpty()) {
      return new HikariDataSource();
    } else {
      HikariConfig config = new HikariConfig();
      config.setJdbcUrl(dbUrl);
      return new HikariDataSource(config);
    }
  }

}
