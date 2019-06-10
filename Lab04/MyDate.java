import java.time.LocalDate;
import java.time.Period;
public class MyDate {
	public int year,month,day;
	public int objectNumber;
	public static int objectCounter = 0;
	public static String[] strMonths = {"January", "February", "March", "April", "May", "June", "July","August", "September", "October", "November", "December"};

public MyDate() {
	year = 1900;
	month = 1;
	day = 1;
	objectCounter++;
	objectNumber = objectCounter;
	
}
public MyDate(int aYear,int aMonth,int aDay) {
	this.year = aYear;
	this.month = aMonth;
	this.day = aDay;
	objectCounter++;
	objectNumber = objectCounter;
	
}
public int getObjectNumber() {
	return objectCounter;
}
public void setDate(int aYear,int aMonth, int aDay) {
	this.year = aYear;
	this.month = aMonth;
	this.day = aDay;
}
public static int yearDiff(MyDate start, MyDate end) {
	int AGE;
	if(start.year > end.year)
	{
		return -1;
	}
	else
	{
		LocalDate BirthDate = LocalDate.of(start.year,start.month,start.day);
		LocalDate Now = LocalDate.of(end.year, end.month,end.day);
		Period age = Period.between(BirthDate, Now);
		AGE = age.getYears();
		if(end.month < start.month)
		{
			return AGE --;
		}
		else if(end.day > start.day)
		{
			return AGE--;
		}
		else {
			return AGE;
		}
	}
}
public void setYear(int aYear) {
	this.year = aYear;
}
public void setMonth(int aMonth) {
	this.month = aMonth;
}
public void setDay(int aDay) {
	this.day = aDay;
}
public int getYear() {
	return year;
}
public int getMonth() {
	return month;
}
public int getDay() {
	return day;
}
public String toString() {
	return "" + day + " " + strMonths[month-1] + " " + year+"";
} 
public static boolean isLeapYear(int year) {
	if(year % 4 !=0)
	{
		return false;
	}
	else if(year % 100 !=0)
	{
		return true;
	}
	else if(year % 400 !=0)
	{
		return false;
	}
	else
	{
		return true;
	}
}
public MyDate nextDay()
{
	if(month == 12) {
		year = year +1;
		month = 1;
		day = 1;
	}
	else if (month == 4 ||month == 6||month == 9||month == 11)
	{
		if(day == 30)
		{
			month = month +1;
			day = 1;
		}
		else
		{
			day = day + 1;
		}
	}
	else
	{
		if(isLeapYear(year) == true && day == 29)
		{
			month = month + 1;
			day = 1;
		}
		else if(isLeapYear(year) == false && day ==28)
		{
			month = month + 1;
			day = 1;
		}
		else
		{
			day = day + 1;
		}
	}
	return this;
}
public MyDate nextMonth() {
	if(month == 12)
	{
		month = 1;
		year = year + 1;
		
	}
	else
	{
		month = month + 1;
	}
	return this;
}
public MyDate nextYear() {
	
	if(isLeapYear(year) == true && month == 2)
	{
		day = 29;
		year = year +1 ;
	}
	else if(month == 2)
	{
		day = 28;
		year = year +1 ;
	}
	else
	{
		year = year +1 ;
	}
	
	
	
	return this;
}
public MyDate previousDay() {
	if(month == 1 && day == 1)
	{
		year = year - 1;
		month = 12;
		day = 31;		
	}
	else
	{
		if(month == 5 || month == 7 ||month == 10||month == 12) {
			if(day == 1)
			{
				month = month - 1  ;
				day = 30;
			}
			else
			{
				day = day - 1;
			}
		}
		else if(month != 3)
		{
			if (day == 1)
			{
				month = month - 1;
				day = 31;
			}
			else
			{
				day = day - 1;
			}
		}
		else
		{
			if(isLeapYear(year) == true && day ==1) {
				month = month -1;
				day = 29;
			}
			else if(day == 1) {
				month = month - 1;
				day = 28;
			}
			else
			{
				day = day - 1;
			}
		}
	}
	return this;
}
public MyDate previousMonth() {
	if(month == 1)
	{
		year = year - 1;
		month = 12;
	}
	else if (day == 31)
	{
		if(month == 5||month == 7||month == 10||month == 12)
		{
			month = month -1 ;
			day = 30;
		}
	}
	else if(month  == 3) {
		if(isLeapYear(year) && day>29)
		{
			month = month -1 ;
			day = 29;
		}
		else if(isLeapYear(year)== false )
		{
			month = month -1;
			day = 28;
		}
	}
	else
	{
		month = month - 1;
	}
	return this;
}
public MyDate previousYear() {
	
	if(isLeapYear(year) == true && month == 2)
	{
		day = 29;
		day = day -1;
		year = year - 1;
	}
	else if(month == 2)
	{
		day = 28;
		year = year - 1;
	}
	else
	{
		year = year - 1 ;
	}
	return this;
}
}
