package com.stardust.asm.visitor;

/**
 * one creates a visitor class that implements all of the appropriate 
 * specializations of the virtual function. 
 * The visitor takes the instance reference as input, 
 * and implements the goal through double dispatch.
 * @author young
 *
 */


//2. Create a "visitor" base class with a visit() method for every "element" type
interface Visitor {
   public void visit( This e ); // second dispatch
   public void visit( That e );
   public void visit( TheOther e );
   public void visit( What e);
}