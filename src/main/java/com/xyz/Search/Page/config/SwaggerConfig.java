package com.xyz.Search.Page.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info=@Info(
                contact = @Contact(
                name="jayalloyd",
                        email="jayaranilloyd1983@gmail.com"),
                description = "open api documentation for search page",
                title = "open api specification-jayalloyd"


        ),
        servers = {
                @Server(
                    description = "local enviroment",
                        url = "http://localhost:8080"
                ),

        }
)
public class SwaggerConfig {

}
