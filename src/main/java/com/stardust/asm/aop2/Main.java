package com.stardust.asm.aop2;

import java.io.IOException;

public class Main { 
    public static void main(String[] args) throws ClassFormatError, InstantiationException, IllegalAccessException, IOException { 
        SecureAccountGenerator sag = new SecureAccountGenerator();
        Account account = sag.generateSecureAccount();
        account.operation();
    } 
}