package ru.sberbark.employee.common.exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6751009865189208990L;

	public EmployeeNotFoundException(String exception) {
		super(exception);
	}

}