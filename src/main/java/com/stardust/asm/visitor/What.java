package com.stardust.asm.visitor;

public class What implements Element {

	public void accept(Visitor v) {
		v.visit(this);

	}

	public String what() {
		return "What";
	}

}
