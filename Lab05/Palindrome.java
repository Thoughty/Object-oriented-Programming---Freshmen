import java.util.Scanner;
public class Palindrome {

	
	public static String Palindrome,Backward = "";
	public static void main(String[] args) {
		Scanner Data = new Scanner(System.in);
		System.out.print("Enter a word or phrase to check if it is a palindrome : ");
		Palindrome = Data.nextLine();
		int length = Palindrome.length();
		for(int i = length - 1 ;i>=0 ;i--)
		{
			Backward = Backward + Palindrome.charAt(i);
		}

		if(Palindrome.replaceAll("\\s+","").replaceAll(",", "").replaceAll("'", "").equalsIgnoreCase(Backward.replaceAll("\\s+","").replaceAll(",", "").replaceAll("'", "")) )
		{
			if(Palindrome.contains("\\s") || Palindrome.contains("'") || Palindrome.contains(","))
			{
				System.out.println("The input phrase " +Palindrome +" is a palindrome" );
			}
			else {
				System.out.println("The input word " +Palindrome +" is a palindrome" );
			}
		}
		else
		{
			if(Palindrome.contains("\\s") || Palindrome.contains("'") || Palindrome.contains(","))
			{
				System.out.println("The input phrase " +Palindrome +" is not a palindrome" );
			}
			else
			{
				System.out.println("The input word " +Palindrome +" is not a palindrome" );
			}
		}
}
}
