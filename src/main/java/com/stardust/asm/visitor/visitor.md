##Part 2: Visitor Pattern
In object-oriented programming and software engineering, the visitor design pattern is a way of separating an algorithm from an object structure on which it operates. A practical result of this separation is the ability to add new operations to existing object structures without modifying those structures.

In essence, the visitor allows one to add new virtual functions to a family of classes without modifying the classes themselves; instead, one creates a visitor class that implements all of the appropriate specializations of the virtual function. The visitor takes the instance reference as input, and implements the goal through double dispatch.

The visitor pattern requires a programming language that supports **single dispatch**. Under this condition, consider two objects, each of some class type; one is called the "element", and the other is called the "visitor". An element has an accept() method that can take the visitor as an argument. The accept() method calls a visit() method of the visitor; the element passes itself as an argument to the visit() method.

##Code Example: 
In this code example, we will use the visitor pattern similar to how it is used in ASM for bytecode manipulation. 
1. Add an accept(Visitor) method to the "element" hierarchy
2. Create a "visitor" base class w/ a visit() method for every "element" type
3. Create a "visitor" derived class for each "operation" to do on "elements"
4. Client creates "visitor" objects and passes each to accept() calls



