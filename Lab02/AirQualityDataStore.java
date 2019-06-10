
public class AirQualityDataStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirQualityProfile location2 = new AirQualityProfile();
		location2.setDatetime("2019-01-18 18:00");
		location2.setLocation("Bangkok");
		location2.setAQI(162);
		location2.setPM25(76);
		location2.setTemp(32);
		location2.setWeather("Few cloud");
		location2.printAirQualityInfo();
		
		AirQualityProfile location3 = new AirQualityProfile();
		location3.setDatetime("2019-01-18 18:00");
		location3.setLocation("Phuket");
		location3.setAQI(45);
		location3.setPM25(11);
		location3.setTemp(31);
		location3.setWeather("Few cloud");
		location3.printAirQualityInfo();
	}

}
