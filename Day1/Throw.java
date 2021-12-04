package Week8.Day1;

public class Throw {

public static void division(int num1,int num2) {
	if(num1<num2) {
		throw new ArithmeticException("Invalid input: num2 is smaller");
	
	}else
	{
		System.out.println(num1/num2);
	}
}
public static void main(String[] args) {
	division(5,10);  //first num  <  second num
}

}
