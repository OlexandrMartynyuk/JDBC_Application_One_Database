package dao.services;

import dao.services.CustomerMapper;
import dao.interfaces.CustomerCRUD;
import dao.models.Customer;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerCRUDImpl implements CustomerCRUD {
	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String QUERY_INSERT = "INSERT INTO Customers  VALUES (null,?,?)";
	private static final String QUERY_UPDATE = "UPDATE Customers SET first_name = ?, last_name = ? WHERE id = ?";
	private static final String QUERY_SELECT_ALL = "SELECT * FROM Customers";
	private static final String QUERY_SELECT_BY_ID = "SELECT * FROM Customers WHERE id = ?";
	private static final String QUERY_DELETE_BY_ID = "DELETE FROM Customers WHERE id = ?";

	@Override
	public void add(Customer customer) {
		jdbcTemplate.update(QUERY_INSERT, customer.getFirst_name(), customer.getLast_name());
	}

	@Override
	public void remove(long id) {
		jdbcTemplate.update(QUERY_DELETE_BY_ID, id);
	}

	@Override
	public void update(Customer customer) {
		jdbcTemplate.update(QUERY_UPDATE, customer.getFirst_name(), customer.getLast_name(), customer.getId());
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> customers = jdbcTemplate.query(QUERY_SELECT_ALL, new CustomerMapper());
		return customers;
	}

	@Override
	public Customer getById(long id) {
		Customer customer = (Customer) jdbcTemplate.queryForObject(QUERY_SELECT_BY_ID, new Object[] { id },
				new CustomerMapper());
		return customer;
	}

}
