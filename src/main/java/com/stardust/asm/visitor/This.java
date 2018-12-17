package com.stardust.asm.visitor;
class This implements Element {
   // 1. accept(Visitor) implementation
   public void   accept( Visitor v ) {
	 //the element passes itself as an argument to the visit() method.
     v.visit( this );
   } 
   public String thiss() {
     return "This";
   }
}