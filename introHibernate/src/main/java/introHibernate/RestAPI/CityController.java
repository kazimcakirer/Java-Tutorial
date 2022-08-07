package introHibernate.RestAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import introHibernate.Business.ICityService;
import introHibernate.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	
	private ICityService cityService;
	
	@Autowired
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> getCities(){
		return cityService.getAll();
	}
	
	@PostMapping("/add")
	public void addCity(@RequestBody City city) {
		cityService.add(city);
	}
	
	@PostMapping("/update")
	public void updateCity(@RequestBody City city) {
		cityService.update(city);
	}
	
	@PostMapping("/delete")
	public void deleteCity(@RequestBody City city) {
		cityService.delete(city);
	}
	
	@GetMapping("/city/{id}")
	public City getCity(@PathVariable int id) {
		return cityService.getById(id);
	}

}
