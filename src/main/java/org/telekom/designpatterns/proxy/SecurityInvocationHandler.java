package org.telekom.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityInvocationHandler implements InvocationHandler {

    private SecurityContext securityContext;

    private EmployeeService employeeService;

    public SecurityInvocationHandler(SecurityContext securityContext, EmployeeService employeeService) {
        this.securityContext = securityContext;
        this.employeeService = employeeService;
    }

    public static EmployeeService createSecurityEmployeeService(SecurityContext securityContext, EmployeeService employeeService){
        return (EmployeeService) Proxy.newProxyInstance( SecurityInvocationHandler.class.getClassLoader(),
                new Class[] {EmployeeService.class},
                new SecurityInvocationHandler(securityContext, employeeService)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(securityContext.hasRole("ROLE_ADMIN")){
            return method.invoke(employeeService, args);
        } else {
            throw new SecurityException("Has no role");
        }
    }
}
