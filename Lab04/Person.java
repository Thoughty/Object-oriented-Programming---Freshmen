import java.time.LocalDate;
import java.time.Period;
public class Person {
	public String firstname,lastname;
	public MyDate birthday;
	
	
	public Person(String aFirstname,String aLastname) {
		firstname = aFirstname;
		lastname = aLastname;
		birthday = new MyDate();
	}
	public Person(String aFirstname,String aLastname,int aYear,int aMonth,int aDay) {
		this.firstname = aFirstname;
		this.lastname = aLastname;
		birthday = new MyDate(aYear,aMonth,aDay);
		
	}
	public int getAge(MyDate aDate) {
		return  MyDate.yearDiff(birthday, aDate) ;
	}
	public boolean isEligible(MyDate elecDate)
	{
		LocalDate Birth = LocalDate.of(birthday.year,birthday.month,birthday.day);
		LocalDate ElecDate = LocalDate.of(elecDate.year, elecDate.month,elecDate.day);
		Period eligible =Period.between(Birth,ElecDate);
		if(eligible.getYears() >= 18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void printPersonInfo() {
		
		System.out.println("Person: " + firstname + " " + lastname );
		System.out.println("Birthday: " + birthday.day + " " +  MyDate.strMonths[birthday.month-1] + " " + birthday.year );
	}
}
