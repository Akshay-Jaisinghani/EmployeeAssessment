package com.example.EmployeeAssessment;

import com.example.EmployeeAssessment.entity.Employee;
import com.example.EmployeeAssessment.repository.EmployeeRepository;
import com.example.EmployeeAssessment.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class EmployeeServiceTest {

	@Mock
	private EmployeeRepository employeeRepository;

	@InjectMocks
	private EmployeeService employeeService;

	public EmployeeServiceTest() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testGetEmployeeById() {
		Employee employee = new Employee();
		employee.setId(1L);
		when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));

		Optional<Employee> result = employeeService.getEmployeeById(1L);
		assertEquals(1L, result.get().getId());
	}
}

