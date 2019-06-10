
public class FreeMember extends Member
{
	
	public int FREE_PRIVATE_REPO = 3 ;
	public int numPrivaterepo = 0;
	public FreeMember(String email, String password) {
		super(email, password);
	}
	public  boolean addRepository(Repository repo)
	{
		if(repo.isPrivate()) {
			if(numPrivaterepo < FREE_PRIVATE_REPO) {
				super.addRepository(repo);
				numPrivaterepo++;
				return true;
			}
			else {
				System.out.println(repo.toString()+" cannot be added because the number of private repository is reaching the limit");
				return false;
			}
		}else {
			super.addRepository(repo);
			return true;
		}
	
	}
	public  boolean removeRepository(Repository repo)
	{
		if(repo.isPrivate()) {
	
					super.removeRepository(repo);
					numPrivaterepo--;
					return true;
		}
			
		else {
			
					super.removeRepository(repo);
					System.out.println(repo.toString() + " is successfully removed.");
					return true;
				
			}
			
	}
	
	public void printMemberInfo()
	{
		System.out.println("---- FREE MEMBER ----");
		super.printMemberInfo();
	}
	public  int getNumPrivateRepo() {
		return numPrivaterepo;
	}
	
	

	
}
