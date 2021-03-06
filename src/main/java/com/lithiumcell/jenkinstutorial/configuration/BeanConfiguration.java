package com.lithiumcell.jenkinstutorial.configuration;

import com.lithiumcell.jenkinstutorial.repositories.DetailsRepository;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(new Info().title("Jenkins Tutorial")
                                            .description("Trying out Jenkins")
                                            .version("1.0"));
    }
}
