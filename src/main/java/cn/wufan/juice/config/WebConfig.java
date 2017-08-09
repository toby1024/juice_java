package cn.wufan.juice.config;

import cn.wufan.juice.filter.WebSiteMeshFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * web config.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public FilterRegistrationBean siteMeshFilter(){
        System.out.println("====filter====");
        FilterRegistrationBean fitler = new FilterRegistrationBean();
        WebSiteMeshFilter siteMeshFilter = new WebSiteMeshFilter();
        fitler.setFilter(siteMeshFilter);
        return fitler;
    }
}
