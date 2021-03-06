import java.util.Scanner;
public class userInput{
	public static void main(String[] arg) {
		Scanner scanner =  new Scanner(System.in);
		
		String firstName, secondName, city;
		int age;
		
		System.out.println("what is your firstname ?");
		firstName = scanner.next();
		
		System.out.println("what is your secondName ?");
		secondName = scanner.next();
		
		System.out.println("where do you live ?");
		city = scanner.next();
		
		System.out.println("How old are you ? ");
		age = scanner.nextInt();
		
		System.out.println(" Hello, \nMy name is "+ firstName + ""+ secondName+ 
				"\nI am "+ age +" years old"+
				"\nI live in "+ city);
	}
}