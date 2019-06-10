
public class LetterPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=-1;
		for(int j = 0; j <= 4;j++)
		{
			for(int i =1;i<=9;i++)
			{
				
				if( j > 0 && i + k == 5 || i - k == 5 && j > 0)
				{
						System.out.print("X");
				}
				else if(i == 1 || i == 9)
					{
						System.out.print("X");
					}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			k++;
		}
	}
}
