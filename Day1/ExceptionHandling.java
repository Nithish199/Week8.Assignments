package Week8.Day1;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int x=10;
		int y=2;
		
		//Select the statement -->rightclick--> surround with --> try/catch block
		
		try {
			System.out.println(x/y);  // if y=0 this will allow the catch block to execute
		} catch (Exception e) {
			System.out.println(e);  // this will print the type of exception
		}
		System.out.println("End of the program");
	}
}
