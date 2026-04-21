package Utilities;
import java.util.Random;
public class RandomGenerator {


	    private static Random rand = new Random();

	    public static EmployeeIDAndEmail generateEmployeeData() {

	        EmployeeIDAndEmail data = new EmployeeIDAndEmail();

	        // Generate Email
	        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
	        StringBuilder email = new StringBuilder();

	        for (int i = 0; i < 8; i++) {
	            email.append(chars.charAt(rand.nextInt(chars.length())));
	        }

	        data.setEmail(email.toString() + "@gmail.com");

	        // Generate Employee ID
	        int number = 1000 + rand.nextInt(9000);
	        data.setEmpId("000" + number);

	        return data;
	    }
	}


