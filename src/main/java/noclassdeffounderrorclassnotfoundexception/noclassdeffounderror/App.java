package noclassdeffounderrorclassnotfoundexception.noclassdeffounderror;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class App {

	private static Log log = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		log.debug("App.main() - classnotfoundexception");
	}

}

/*
 * 
 * 
 * cmd/>java -cp ScrumTimeCaptureMaintenence.jar Main
 * 
 * In Eclipse: right-click on your project -> Export -> JAR file * At last page
 * of options (when there will be no Next button active) you will see Main
 * class:. You need to set here class with main method that should be executed.
 * 
 * 
 * 
 * public class NoClassDefFoundError extends LinkageError, extends java.lang.Error
 * 
 * Thrown if the Java Virtual Machine or a ClassLoader instance tries to load in the definition of
 * a class (as part of a normal method call or as part of creating a new
 * instance using the new expression) and no definition of the class could be found.
 * 
 * The searched-for class definition existed when the currently executing
 * class was compiled, but the definition can no longer be found.
 */