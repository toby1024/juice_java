package cn.wufan.juice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * start from here.
 */
@SpringBootApplication
public class JuiceJavaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JuiceJavaApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JuiceJavaApplication.class, args);
    }

}
