package com.stardust.asm.visitor;

/**
 * visitor方法怎样实现完全自己控制，将传进来实现Element接口的类的对象传进来。
 * @author young
 *
 */


class DownVisitor implements Visitor {
   public void visit( This e ) {
      System.out.println( "do Down on " + e.thiss() );
   }
   public void visit( That e ) {
      System.out.println( "do Down on " + e.that() );
   }
   public void visit( TheOther e ) {
      System.out.println( "do Down on " + e.theOther() );
   }
   public void visit( What e) {
	 System.out.println( "do Down on " + e.what() );
	
}
}
