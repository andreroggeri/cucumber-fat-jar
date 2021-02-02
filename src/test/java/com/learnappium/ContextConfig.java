package com.learnappium;

import com.learnappium.config.AndroidTestConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {AndroidTestConfig.class})
public class ContextConfig {
}
