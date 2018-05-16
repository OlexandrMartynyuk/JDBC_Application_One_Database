package dao.models;

/*
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/


public class Customer {
	private long id;
	private String first_name, last_name;

	public Customer(long id, String firstName, String lastName) {
		this.id = id;
		this.first_name = firstName;
		this.last_name = lastName;

	}

	public Customer() {

		this.first_name = null;
		this.last_name = null;

	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getLast_name() {
		return last_name;
	}

	@Override
	public String toString() {
		return "{"+'"'+"id"+'"'+": " + id + ", \n"+'"'+"first_name"+'"'+": " +'"'+first_name+'"' + ", \n"+'"'+"last_name"+'"'+": " +'"'+last_name+'"'+"}";
	}
}
