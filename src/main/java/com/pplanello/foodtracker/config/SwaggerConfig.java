package com.pplanello.foodtracker.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger configuration with authorization header and application info
 * <p>
 * Using SpringDoc attributes this class is only for customization
 */
@Configuration
public class SwaggerConfig {

    @Value("${app.info.name}")
    private String name;

    @Value("${app.info.version}")
    private String version;

    @Value("${app.info.description}")
    private String description;

    /**
     * Default constructor
     */
    public SwaggerConfig() {
        super();
    }

    /**
     * Gets the api info from properties
     *
     * @return API info
     */
    @Bean
    public OpenAPI getOpenApiInfo() {
        return new OpenAPI().info(new Info().title(name).version(version)
                .description(description));
    }

    /**
     * Create an API response object
     *
     * @param message Description
     * @param schema  Content schema
     * @return Api response
     */
    private ApiResponse createApiResponse(String message, Schema schema) {

        MediaType mediaType = new MediaType();
        mediaType.schema(schema);

        return new ApiResponse().description(message)
                .content(new Content().addMediaType(org.springframework.http.MediaType.APPLICATION_JSON_VALUE, mediaType));
    }
}
