package com.stardust.asm.aop;
import java.io.File; 
import java.io.FileOutputStream;
import java.io.IOException;

import org.objectweb.asm.*; 
    
public class Generator{ 
    public static void main(String[] args) throws IOException {
    	 ClassReader cr = new ClassReader("com.stardust.asm.aop.Account"); 
         ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS); 
         ClassAdapter classAdapter = new AddSecurityCheckClassAdapter(cw); 
         cr.accept(classAdapter, ClassReader.SKIP_DEBUG); 
         byte[] data = cw.toByteArray(); 
         File file = new File("D:\\Account.class"); 
         FileOutputStream fout = new FileOutputStream(file); 
         fout.write(data); 
         fout.close(); 
	}
}