package com.stardust.asm.visitor;

/// 3. Create a "visitor" derived class for each "operation" to perform on "elements"
class UpVisitor implements Visitor {
	public void visit(This e) {
		System.out.println("do Up on " + e.thiss());
	}

	public void visit(That e) {
		System.out.println("do Up on " + e.that());
	}

	public void visit(TheOther e) {
		System.out.println("do Up on " + e.theOther());
	}

	public void visit(What e) {

		System.out.println("do Up on " + e.what());
	}
}
