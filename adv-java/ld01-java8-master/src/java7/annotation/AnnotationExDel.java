package java7.annotation;
// annotations :
//provide metadata
// not a part of the program
// released in jdk1.5
// annotations do not affect the logic of operations to which we attach them.

//predefined, user-defined
//create annotation, apply annotations
// instructions to the compiler
//@Override, @SupressWarnings
// instructions to runtime

//retention policies
//compiler, class, runtime

//element types
//packages, types, methods, parameters, constructors, field, local variables
public class AnnotationExDel {

}

class Test{
	public void method() {
		
	}
}
//@Override
class Test1 extends Test{
	@Override
	public void method() {
		
	}
//	@Override
	public void method1() {
		
	}
}
