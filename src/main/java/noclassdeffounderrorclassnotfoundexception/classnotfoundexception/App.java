package noclassdeffounderrorclassnotfoundexception.classnotfoundexception;

public class App {

	public static void main(String[] args) {

		try {
			//Class.forName("SomeClassName");
			ClassLoader.getSystemClassLoader().loadClass("SomeClassName");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

/**
 * public class ClassNotFoundException extends ReflectiveOperationException, extends java.lang.ReflectiveOperationException
 * 
 * Thrown when an application tries to load in a class through its string name using: 
 * 
 * The forName method in class Class. The findSystemClass method in class
 * ClassLoader . The loadClass method in class ClassLoader.
 * 
 * but no definition for the class with the specified name could be found.
 */
