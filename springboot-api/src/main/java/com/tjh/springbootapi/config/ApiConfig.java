package com.tjh.springbootapi.config;

import com.koala.apiprototype.config.BaseConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Import(BaseConfig.class)
public class ApiConfig implements WebMvcConfigurer {
}
