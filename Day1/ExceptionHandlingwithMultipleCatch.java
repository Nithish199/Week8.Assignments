package Week8.Day1;

public class ExceptionHandlingwithMultipleCatch {

	public static void main(String[] args) {
		int x=15;
		int y=0;
		
		int []nums= {10,20,30};
		
		try {
			System.out.println(x/y);
			System.out.println(nums[3]);
			
		} catch (ArithmeticException e) {
			if(y==0) {
				System.out.println(x/1);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	
		System.out.println("End of The Program");
	}
}
