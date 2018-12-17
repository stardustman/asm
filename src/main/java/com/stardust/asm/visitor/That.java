package com.stardust.asm.visitor;
class That implements Element {
   public void   accept( Visitor v ) {
	 //the element passes itself as an argument to the visit() method.
     v.visit( this );
   }
   public String that() {
     return "That";
   }
}