import java.util.ArrayList;

public class Member {

	String email,password;
	ArrayList<Repository> repoList;
	
	public Member(String email,String password) {
		this.email = email;
		this.password = password;
		repoList = new ArrayList<>();
	}
	public boolean addRepository(Repository repo)
	{
		
		if(repo != null)
		{
			//System.out.println("adding" + repo.toString());
			repoList.add(repo);
			return true;
		}
		else
		{
			return false;
		}
	}
	public  boolean removeRepository(Repository repo)
	{
		for(Repository i: repoList) {
			if(i.isEqual(repo)) {
				repoList.remove(i);
				System.out.println(i.toString() + " is successfully removed.");
				return true;
			
		}
		}
		return false;
	}
	public void printMemberInfo()
	{
		System.out.println("Email : "+email + "  (pwd : "+password+")");
		System.out.println("List of repositories");
		for(Repository print : repoList)
		{
			System.out.println(print.toString());
		}
	}
	
}
