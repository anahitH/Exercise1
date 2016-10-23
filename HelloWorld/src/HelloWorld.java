import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.println("Please enter your name: ");
		
		BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in));
		String userName = inReader.readLine();
		
		HelloUser helloUser = new HelloUser(userName);
		helloUser.greetUser();
	}

}
