package com.stardust.asm;

/**
 * 想对Account的operation方法执行之前进行一些其他的操作，比如执行SecurityChecker里的方法。
 * 可以使用decorator模式
 * 1.将原来的Account变成一个接口
 * 2.原来的Account里的实现内容变成实现类
 * 3.AccountWithSecurityCheck 实现 Account接口，执行方法之前调用SecurityChecker的方法。
 * 此方法的弊端是想做些小动作，代价太大。归根结底还是java不允许在运行时修改class文件。
 * @author young
 *
 */
public class Account { 
    public void operation() { 
        System.out.println("operation..."); 
        //TODO real operation 
    } 
}