package Entities;

import java.time.LocalDate;

public class Customer {
	
	public int Id;
	public String Name;
	public String Surname;
	public LocalDate dateOfBirth;
	public Long nationalityId;
	
	public Customer(int id, String name, String surname, LocalDate dateOfBirth, Long nationalityId) {
		super();
		Id = id;
		Name = name;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
}
