package org.paramtest.pu.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: PARAMESHWARAN PV
 * Date: 08-Mar-2025 : 12:49:18 PM
 * Since: 1.0.0
 * @See #
 */

@SpringBootApplication
@ComponentScan(basePackages = "org.paramtest.*")
public class HelloWorldTestPublic extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorldTestPublic.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloWorldTestPublic.class);
	}

}
