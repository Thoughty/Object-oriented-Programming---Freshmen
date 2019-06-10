import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.Month;
public class AirQualityProfile {
	private String datetime,location,weather,season;
	private int AQI,PM25,temp;
	static int count = 0;
	
	public AirQualityProfile() {
		datetime ="2019-01-18 18:00";
		location = "Thon Buri";
		weather = "(Few Cloud)";
		AQI = 122;
		PM25 = 40;
		temp = 29;
		count++;
		
	}
	LocalDateTime today = LocalDateTime.now();
	public void season() {
		if(today.getMonthValue() >= 3 && today.getMonthValue() <=6)
		{
			season = "Summer";
		}
		else if(today.getMonthValue() >= 7 && today.getMonthValue()<= 10)
		{
			season ="Rainy";
		}
		else
		{
			season = "Winter";
		}
	}
	
	
	public String getDatetime() {
		return datetime;
	}


	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}


	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public int getAQI() {
		return AQI;
	}
	public void setAQI(int aQI) {
		AQI = aQI;
	}
	public int getPM25() {
		return PM25;
	}
	public void setPM25(int pM25) {
		PM25 = pM25;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public boolean isUnhealthy(){
		if(AQI > 100)
		{
			return true;
		}
		return false;
	}
	public void printAirQualityInfo() {
		
		
		isUnhealthy();
		season();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm");
		
	//	System.out.println(location + " at "+ date +" "+ time );
		System.out.println(location + " at " + today.format(formatter) + " Season : "+season); // apply localdatetime fucntion
		System.out.println("AQI: " + AQI + " PM2.5: "+ PM25 +" microgram/m3");
		System.out.println(temp + " celsius" + " (" + weather + ")");
		System.out.println(count);
		if(isUnhealthy() == true)
		{
			System.out.println("Unhealthy");
		}
		else
		{
			System.out.println("Healthy");
		}
	}
}

