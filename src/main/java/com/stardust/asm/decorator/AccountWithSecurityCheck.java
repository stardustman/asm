package com.stardust.asm.decorator;

import com.stardust.asm.SecurityChecker;

public class AccountWithSecurityCheck implements Account {     
    private  Account account; 
    public AccountWithSecurityCheck (Account account) { 
        this.account = account; 
    } 
    public void operation() { 
        SecurityChecker.checkSecurity(); 
        account.operation(); 
    } 
}