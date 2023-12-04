package org.telekom.designpatterns.viselkedesi.interpreter;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.StringTemplateResolver;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class EmployeeRenderer {

    public String render(List<Employee> employeeList){
        String template = "<ul><li th:each='employee: ${employeesList}'><span th:text='${employee.name}'></li></ul>";

        // Parser and Interpreter
        TemplateEngine templateEngine = getTemplateEngine();

        Map<String, Object> variables = new HashMap<>();
        variables.put("employeesList", employeeList);

        Context context = new Context(
                new Locale("hu", "HU"),
                variables);
        return templateEngine.process(template, context);
    }

    private TemplateEngine getTemplateEngine(){
        TemplateEngine templateEngine = new TemplateEngine();
        StringTemplateResolver templateResolver = new StringTemplateResolver();

        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateEngine.addTemplateResolver(templateResolver);
        return templateEngine;
    }
}
