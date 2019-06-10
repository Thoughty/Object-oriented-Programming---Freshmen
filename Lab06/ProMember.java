import java.util.ArrayList;

public class ProMember extends Member
{
	public double fee;
	public static double COLLABORATOR_FEE = 80.0;
	ArrayList<String> collaborator;
	public ProMember(String email, String password, double fee ) {
		super(email, password);
		this.fee = fee;
		collaborator = new ArrayList<>();
	}
	public boolean addCollaborator(String username)
	{
		if(username.isEmpty())
		{
			return false;
		}
		else
		{
			collaborator.add(username);
			System.out.println(username + " is added successfully.");
			return true;
		}
	}
	public boolean removeCollaborator(String username)
	{
		for(String user : collaborator)
		{
			if(user.equals(username))
			{
				collaborator.remove(user);
				System.out.println(username + " is successfully removed.");
				return true;
			}
		}
		System.out.println(username + " cannot be removed.");
		return false;
				
			
	}
	public double getMonthlyBill() {
		double sum = this.fee + (COLLABORATOR_FEE * collaborator.size());
		return sum;
	}
	
	public void printMemberInfo()
	{
		System.out.println("---- PRO MEMBER ----");
		System.out.println("Member Fee :" + fee);
		super.printMemberInfo();
		System.out.println("--------------------");
		System.out.println("List of collaborator");
		System.out.println(collaborator.toString().replace("[","").replace("]",""));
	}

}
