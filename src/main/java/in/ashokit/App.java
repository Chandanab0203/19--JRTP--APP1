package in.ashokit;

import in.ashokit.security.service.PasswordService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PasswordService password = new PasswordService();
    	System.out.println(password.encrypt("Chan1234"));
    	
    	String decoder = password.decrypt(password.encrypt("Chan1234"));
    	System.out.println(decoder);
    }
}
