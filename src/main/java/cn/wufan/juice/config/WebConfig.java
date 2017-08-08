package cn.wufan.juice.config;

import cn.wufan.juice.filter.WebSiteMeshFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    /**
     * 装饰器
     * @return
     * 2016年8月27日下午12:37:20
     */
    @Bean
    public FilterRegistrationBean siteMeshFilter(){
        System.out.println("====filter====");
        FilterRegistrationBean fitler = new FilterRegistrationBean();
        WebSiteMeshFilter siteMeshFilter = new WebSiteMeshFilter();
        fitler.setFilter(siteMeshFilter);
        return fitler;
    }
}