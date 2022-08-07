package fileDemo;

public class City {

	private int id;
	private String cityName;
	private String countryCode;
	private String distruct;
	private int population;
	
	public City () {
		
	}

	public City(int id, String cityName, String countryCode, String distruct, int population) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.countryCode = countryCode;
		this.distruct = distruct;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistruct() {
		return distruct;
	}

	public void setDistruct(String distruct) {
		this.distruct = distruct;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	
}
