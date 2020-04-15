package com.jd.conf;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.jd")
@EnableWebMvc 
public class AppConfig  implements WebMvcConfigurer {
	
	@Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	   @Bean(name = "dataSource")
	   public DataSource getDataSource() {
	       DriverManagerDataSource dataSource = new DriverManagerDataSource();
	 
	       // See: datasouce-cfg.properties
	       dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	       dataSource.setUrl("jdbc:mysql://localhost:3306/citra?" +
	        		"useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false");
	       dataSource.setUsername("ct");
	       dataSource.setPassword("ad");
	 	 
	       return dataSource;
	   }
	   
	   @Bean
	    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	        jdbcTemplate.setResultsMapCaseInsensitive(true);
	        return jdbcTemplate;
	    }
	
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
 
}
