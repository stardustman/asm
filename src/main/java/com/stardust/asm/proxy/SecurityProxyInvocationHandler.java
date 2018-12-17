package com.stardust.asm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.stardust.asm.SecurityChecker;

class SecurityProxyInvocationHandler implements InvocationHandler { 
    private Object proxyedObject; 
    //这里被代理的是AccountImpl的对象
    public SecurityProxyInvocationHandler(Object o) {
    	//被代理的对象
        proxyedObject = o; 
    } 
        
    public Object invoke(Object object, Method method, Object[] arguments) 
        throws Throwable {             
        if (object instanceof Account && method.getName().equals("operation")) { 
            SecurityChecker.checkSecurity(); 
        } 
        return method.invoke(proxyedObject, arguments); 
    } 
}