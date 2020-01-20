package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	/*
	 * testCs are a set of unit tests made with the purpose of evaluate 
	 * the method cs that calculates the salary of the employee in relation
	 * with the type of employee and if it receives the extra 10% of salary
	 * if the month is odd.
	 */
	@Test
	void testCs1() {
		Employee e = new Employee(400F,"EUR",0.8F,EmployeeType.Worker);
		float salario = e.cs();
		assertEquals(444.33F,salario,0.01F);
	}	
	@Test
	void testCs2() {
		Employee e2 = new Employee(400F,"EUR",0.8F,EmployeeType.Supervisor);
		float salario = e2.cs();
		assertEquals(444.61F,salario,0.01F);
	}
	
	@Test
	void testCs3() {
		Employee e3 = new Employee(400F,"EUR",0.8F,EmployeeType.Manager);
		float salario = e3.cs();
		assertEquals(444.89F,salario,0.01F);
	}
	
	@Test
	void testCs4() {
		Employee e4 = new Employee(400F,"USD",0.8F,EmployeeType.Worker);
		float salario = e4.cs();
		assertEquals(464.33F,salario,0.01F);
	}
	
	@Test
	void testCs5() {
		Employee e5 = new Employee(400F,"USD",0.8F,EmployeeType.Supervisor);
		float salario = e5.cs();
		assertEquals(464.61F,salario,0.01F);
	}
	
	@Test
	void testCs6() {
		Employee e6 = new Employee(400F,"USD",0.8F,EmployeeType.Manager);
		float salario = e6.cs();
		assertEquals(464.89F,salario,0.01F);
	}
}
