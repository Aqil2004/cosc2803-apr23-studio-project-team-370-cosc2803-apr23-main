package app.helpers;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;

public class ThymeleafConfig {
    public static TemplateEngine buildTemplateEngine() {
        TemplateEngine templateEngine = new TemplateEngine();

        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("/templates/");
        templateResolver.setCharacterEncoding("UTF-8");

        templateEngine.addTemplateResolver(templateResolver);
        templateEngine.addDialect(new LayoutDialect());

        return templateEngine;
    }
}
