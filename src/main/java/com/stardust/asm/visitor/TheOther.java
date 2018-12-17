package com.stardust.asm.visitor;
class TheOther implements Element {
   public void   accept( Visitor v ) {
	 //the element passes itself as an argument to the visit() method.
     v.visit( this );
   }
   public String theOther() {
     return "TheOther"; 
   }
}