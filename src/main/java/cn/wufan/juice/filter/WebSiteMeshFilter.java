package cn.wufan.juice.filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        System.out.println("----sitemesh---->");
        builder.addDecoratorPath("/*","/home/main")
                .addExcludedPath("/static/*")
                .addExcludedPath("/login");
    }
}