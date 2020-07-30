package java7.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class CustomAnnotationEx {
//Using the Reflection API
	public static void main(String[] args) {
		Class testClass = TestClass.class;
		// Getting the methods here
		for (Method method : testClass.getMethods()) {
			// Getting annotation for each method
			for (Annotation annotation : method.getDeclaredAnnotations()) {
				System.out.println("Method > " + method + "  >>> " + annotation);
			}
		}
	}
}

//Create a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodMetaDataAnnotation {
	// elements
	public String developer() default "Simon";
}

//applying the annotation
class TestClass {
	@MethodMetaDataAnnotation(developer = "Peter")
	public void newTestMethod() {
		System.out.println("My Test Method!");
	}

	@MethodMetaDataAnnotation()
	public void oldTestMethod() {
		System.out.println("My Test Method!");
	}
}