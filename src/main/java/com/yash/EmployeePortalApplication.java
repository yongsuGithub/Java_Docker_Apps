package com.yash;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
@ComponentScan("com.yash")
public class EmployeePortalApplication {

	public static void main(String[] args) {
		// SpringApplication.run(NewsPortalApplication.class, args);
		new SpringApplicationBuilder(EmployeePortalApplication.class).build().run(args);
	}

	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
		return new HibernateJpaSessionFactoryBean();
	}
}