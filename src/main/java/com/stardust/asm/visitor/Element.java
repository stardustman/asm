package com.stardust.asm.visitor;

/**
 * An element has an accept() method that can take the visitor as an argument. 
 * The accept() method calls a visit() method of the visitor; 
 * 
 * @author young
 *
 */
interface Element {
   // 1. accept(Visitor) interface
   public void accept( Visitor v ); // first dispatch
}


