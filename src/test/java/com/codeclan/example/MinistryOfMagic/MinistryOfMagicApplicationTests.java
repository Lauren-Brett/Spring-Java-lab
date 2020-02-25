package com.codeclan.example.MinistryOfMagic;

import com.codeclan.example.MinistryOfMagic.models.Department;
import com.codeclan.example.MinistryOfMagic.models.Employee;
import com.codeclan.example.MinistryOfMagic.models.Project;
import com.codeclan.example.MinistryOfMagic.repositories.DepartmentRepository;
import com.codeclan.example.MinistryOfMagic.repositories.EmployeeRepository;
import com.codeclan.example.MinistryOfMagic.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MinistryOfMagicApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department mysteries= new Department("Department of Mysteries");
		departmentRepository.save(mysteries);

		Employee lucius = new Employee("Lucius", "Malfoy",4567, mysteries);
		employeeRepository.save(lucius);
	}


	@Test
	public void createDepartment(){
		Department internationalMagicalCoop= new Department("International Magical Coop");
		departmentRepository.save(internationalMagicalCoop);

		Employee lucius = new Employee("Lucius", "Malfoy",4567, internationalMagicalCoop);
		employeeRepository.save(lucius);

		Project project = new Project("Lab", 90);
		projectRepository.save(project);

		project.addEmployee(lucius);
		projectRepository.save(project);


	}



}
