package dao.interfaces;

import java.util.List;
import dao.models.Customer;;

public interface CustomerCRUD {

	void add(Customer customer);
	void remove(long id);
	void update(Customer customer);
	List<Customer> getAll();
	Customer getById(long id);
	
}