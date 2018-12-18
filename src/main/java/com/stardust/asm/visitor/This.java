package com.stardust.asm.visitor;
class This implements Element {
   // 1. accept(Visitor) implementation
   public void   accept( Visitor v ) {
	 //the element passes itself as an argument to the visit() method.
	 //持有一个visitor，用这个visitor遍历自己，将自己传递给visitor
     v.visit( this );
   } 
   public String thiss() {
     return "This";
   }
}