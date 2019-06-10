
public class EggStop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<=2;i++)
		{
			System.out.println("  ________");
			System.out.println(" /        \\");
			System.out.println("/          \\");
			if(i == 2)
			{ 
				System.out.println("|   Stop   |");
			}
			System.out.println("\\          /");
			System.out.println(" \\________/");
			if(i>=1)
			{
				System.out.println("+-----------+");
			}
		}
	}

}
