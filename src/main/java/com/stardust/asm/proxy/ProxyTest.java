package com.stardust.asm.proxy;

import java.lang.reflect.Proxy;

/**
 * * Proxy 是面向接口的，所有使用 Proxy 的对象都必须定义一个接口，
 * 而且用这些对象的代码也必须是对接口编程的：
 * Proxy 生成的对象是接口一致的而不是对象一致的：
 * 例子中 Proxy.newProxyInstance生成的是实现 Account接口的对象而不是 AccountImpl的子类。
 * 这对于软件架构设计，尤其对于既有软件系统是有一定掣肘的。
 * Proxy 毕竟是通过反射实现的，必须在效率上付出代价：
 * 有实验数据表明，调用反射比一般的函数开销至少要大 10 倍。
 * 而且，从程序实现上可以看出，对 proxy class 的所有方法调用都要通过使用反射的 invoke 方法。
 * 因此，对于性能关键的应用，使用 proxy class 是需要精心考虑的，以避免反射成为整个应用的瓶颈。
 * @author young
 *
 */
public class ProxyTest {
	public static void main(String[] args) { 
		/**
		 * 生成代理对象大概需要2步
		 * 1. Look up or generate the designated proxy class.
		 * 2. Invoke its constructor with the designated invocation handler.
		 */
	    Account account = (Account) Proxy.newProxyInstance( 
	        Account.class.getClassLoader(), //Class Loader
	        new Class[] { Account.class }, //接口
	        new SecurityProxyInvocationHandler(new AccountImpl()) //实现类
	    ); 
	    account.operation();
	}
	
}

