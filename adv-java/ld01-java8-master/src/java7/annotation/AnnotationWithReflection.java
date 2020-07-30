package java7.annotation;

import java.lang.reflect.Field;

public class AnnotationWithReflection {
	public static void main(String[] args) {
		//Create an instance of the class
		DBFields dbFieldsInstance = new DBFields();
		//Class represents instances of a class or interface at runtime.
		//getClass() - Returns the runtime class of this Object
		Class dbFieldsClass = dbFieldsInstance.getClass();
		//Returns a Field object that reflects the specified public member field of the class or interface
		//represented by this Classobject. 
		//The name parameter is a String specifying the simple name of the desired field. 
		try {
			Field firstNameField = dbFieldsClass.getField("firstName");
			//Returns the value of the field represented by this Field, on the specified object. 
			//The value is automatically wrapped in an object if it has a primitive type.
			String firstName = (String)firstNameField.get(dbFieldsInstance);
			System.out.println(firstName);
			firstNameField.set(dbFieldsInstance, "Michael");
			String firstNameModifiedThroughReflectionString = (String)firstNameField.get(dbFieldsInstance);
			System.out.println(firstNameModifiedThroughReflectionString);
			//System.out.println(firstName);
		} catch (NoSuchFieldException e) {
			System.out.println("EXCEPTION :>> " + e);
		} catch (SecurityException e) {
			System.out.println("EXCEPTION :>> " + e);
		} catch (IllegalArgumentException e) {
			System.out.println("EXCEPTION :>> " + e);
		} catch (IllegalAccessException e) {
			System.out.println("EXCEPTION :>> " + e);
		}
	}
}
