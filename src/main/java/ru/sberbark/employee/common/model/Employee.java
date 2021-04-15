package ru.sberbark.employee.common.model;

public class Employee {

	private Integer id;
	private String surname;
	private String name;
	private String patronymic;

	public Employee(Integer id, String name, String surname, String patronymic) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", surname=" + surname + ", name=\" + name + \", patronymic=" + patronymic + "]";
	}
		
}