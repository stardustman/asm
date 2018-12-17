package com.stardust.asm.decorator;

public class DecoratorTest {
      public static void main(String[] args) {
		AccountWithSecurityCheck awsc = new AccountWithSecurityCheck(new AccountImpl());
		awsc.operation();
	}
}
