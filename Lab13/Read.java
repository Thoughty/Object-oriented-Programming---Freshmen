import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Read {

	public static List<String> ReadFile(String Filename)
	{
		List<String> Alpha = new ArrayList<String>();
		BufferedReader Read = null;
		try {
				Read = new BufferedReader(new FileReader(Filename));
				String line;
				while((line = Read.readLine())!= null)
				{
					String[] Split = line.split(" ");
					for(String name : Split)
					{
						Alpha.add(name);
					}
				}
				
		
		}
		catch(FileNotFoundException e){ // Print Result if file not found in the inserted directory 
			e.printStackTrace();
		}
		catch(IOException e) // Print Result if Error is occur
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				Read.close();
			}
			catch(IOException ie) //  Print Error result 
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
			
		}
		return Alpha;
	}
	public static void PrintData(List<String> GoodGame)
	{
		System.out.print("[");
		for(int i=0; i< GoodGame.size(); i++)
		{
			if(i + 1 == GoodGame.size())
			{
				System.out.print(GoodGame.get(i).toString());
			}
			else
			{
				System.out.print(GoodGame.get(i).toString()+", ");
			}
		}
		System.out.println("]");
	}
	public static void Sorting(List<String> WellWell)
	{
		
		String CompString;
		for(int i=0;i<WellWell.size();i++)
		{
			
			for(int j=0;j<WellWell.size();j++)
			{
				if(WellWell.get(i).compareTo(WellWell.get(j)) > 0)
				{
					CompString = WellWell.get(j);
					WellWell.set(j, WellWell.get(i));
					WellWell.set(i,CompString);
				
				}
			}
			if(i>=1)
			{
				System.out.print("Pass "+(i)+": ");
				PrintData(WellWell);
			}
		}
		
	}
	public static boolean Palinnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnndrome(String word)
	{
		word = word.toLowerCase().replace(" ", "").replaceAll("\\W", "");
		if(word.length() == 0 || word.length() == 1)
		{
            return true;
		}
        if(word.charAt(0) == word.charAt(word.length()-1))
        {
        	return Palinnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnndrome(word.substring(1,word.length()-1));
        }
        else
        {
        	return false;
        }
	}
	public static void main(String[] args)
	{
		List<String> DataStore = new ArrayList<String>();
		String Filename = "unsorted.txt";
		Read Testing = new Read();
		DataStore = Testing.ReadFile(Filename);
		System.out.print("Original: ");
		PrintData(DataStore);
		Sorting(DataStore);
		
		
		System.out.println("\n\n\n!!!Bonus Stage!!!");
		String CheckPalindrome = "A man, a plan, a canal, Panama!";
		String CheckPalindrome2 = "TwiceOnce";
		String CheckPalindrome3 = "Minatosaki Sana";
		System.out.print(CheckPalindrome);
		if(Palinnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnndrome(CheckPalindrome))
		{
			System.out.println(" is a Palindrome");
		}
		else
		{
			System.out.println(" is Not a Palindrome");
		}
		System.out.print(CheckPalindrome2);
		if(Palinnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnndrome(CheckPalindrome2))
		{
			System.out.println(" is a Palindrome");
		}
		else
		{
			System.out.println(" is Not a Palindrome");
		}
		System.out.print(CheckPalindrome3);
		if(Palinnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnndrome(CheckPalindrome3))
		{
			System.out.println(" is a Palindrome");
		}
		else
		{
			System.out.println(" is Not a Palindrome");
		}
		

	}
}
