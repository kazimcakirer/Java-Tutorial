package introHibernate.DataAccess;

import java.util.List;

import introHibernate.Entities.City;

public interface ICityDal {

	public List<City> gets();

	public City getById(int id);

	public void add(City city);

	public void update(City city);

	public void delete(City city);

}
