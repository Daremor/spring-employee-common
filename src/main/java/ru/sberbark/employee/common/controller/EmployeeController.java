package ru.sberbark.employee.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sberbark.employee.common.exception.EmployeeNotFoundException;
import ru.sberbark.employee.common.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		
		switch (id) {
			case 1:
				return new Employee(1, "Шубин", "Юстиниан", "Аристархович");
			case 2:
				return new Employee(2, "Большаков", "Иван", "Владленович");
			case 3:
				return new Employee(3, "Евсеев", "Лукьян", "Тихонович");
			case 4:
				return new Employee(4, "Горшков", "Евгений", "Валерьевич");
			default:
				throw new EmployeeNotFoundException("id-" + id);
		}

	}

}