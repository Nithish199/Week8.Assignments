package Week8.Day1;

public class Finally {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		try {
			System.out.println(x/y);
		}finally {
			System.out.println("Finally Block of Code");
		}
		System.out.println("End of the Program");
		
	}
}
