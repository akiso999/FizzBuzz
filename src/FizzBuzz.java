public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int number = 1; number <= 100; number++) { 
			if ( number % 3 == 0 && number % 5 == 0 ) {
				System.out.println( "FizzBuzz");
			}else if (number % 3 == 0 ) {
				System.out.println( "Fizz");
			}else if (number % 5 == 0) {
				System.out.println( "Buzz");
			}else {
				System.out.println(number);
			}
		}
			
	}
}		
