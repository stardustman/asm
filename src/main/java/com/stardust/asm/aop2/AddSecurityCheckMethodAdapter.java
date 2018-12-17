package com.stardust.asm.aop2;

import org.objectweb.asm.MethodAdapter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;


/**
 * ChangeToChildConstructorMethodAdapter
 * 将负责把 Account的构造函数改造成其子类 Account$EnhancedByASM的构造函数：
 * @author young
 *
 */
class AddSecurityCheckMethodAdapter extends MethodAdapter { 
    public AddSecurityCheckMethodAdapter(MethodVisitor mv) { 
        super(mv); 
    } 
 
    public void visitCode() { 
        visitMethodInsn(Opcodes.INVOKESTATIC, "SecurityChecker", 
           "checkSecurity", "()V"); 
    } 
}