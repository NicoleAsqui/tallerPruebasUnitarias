package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//
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
	//Calculate the bonus of the employee depended on the currency and the type of employee
//Test para Worker con currency USD
	@Test
	void testCalculateYearBonusWorkerUSD() {
	float bonusPercentage = (float) 0.1;
	float salary =1500;
	String currency ="USD";
	EmployeeType etype=EmployeeType.Worker;
	Employee emp =
			new Employee(salary,currency,bonusPercentage,etype);
	float expected =386;
	float experimental = emp.CalculateYearBonus();
	assertEquals(expected,experimental,0.1);


}

//Test para Worker con currency USD
	@Test
	void testCalculateYearBonusWorkerELSE() {
		float bonusPercentage = (float) 0.1;
		float salary =1500;
		String currency ="EUR";
		EmployeeType etype=EmployeeType.Worker;
		Employee emp =
				new Employee(salary,currency,bonusPercentage,etype);
		float expected =386;
		float experimental = emp.CalculateYearBonus();
		assertEquals(expected,experimental,0.1);


	}

	//Test para Supervisor con currency USD
	@Test
	void testCalculateYearBonusSupervisorUSD() {
		float bonusPercentage = (float) 0.1;
		float salary =1500;
		String currency ="USD";
		EmployeeType etype=EmployeeType.Supervisor;
		Employee emp =
				new Employee(salary,currency,bonusPercentage,etype);
		float expected =1693;
		float experimental = emp.CalculateYearBonus();
		assertEquals(expected,experimental,0.1);


	}

	//Test para Supervisor con currency ELSE
		@Test
		void testCalculateYearBonusSupervisoELSE() {
			float bonusPercentage = (float) 0.1;
			float salary =1500;
			String currency ="EUR";
			EmployeeType etype=EmployeeType.Supervisor;
			Employee emp =
					new Employee(salary,currency,bonusPercentage,etype);
			float expected =1618;
			float experimental = emp.CalculateYearBonus();

			assertEquals(expected,experimental,0.1);


		}


		//Test para Manager con currency USD
		@Test
		void testCalculateYearBonusManagerUSD() {
			float bonusPercentage = (float) 0.1;
			float salary =1500;
			String currency ="USD";
			EmployeeType etype=EmployeeType.Manager;
			Employee emp =
					new Employee(salary,currency,bonusPercentage,etype);
			float expected =1886;
			float experimental = emp.CalculateYearBonus();
			assertEquals(expected,experimental,0.1);


		}

		//Test para Manager con currency ELSE
			@Test
			void testCalculateYearBonusManagerELSE() {
				float bonusPercentage = (float) 0.1;
				float salary =1500;
				String currency ="EUR";
				EmployeeType etype=EmployeeType.Manager;
				Employee emp =
						new Employee(salary,currency,bonusPercentage,etype);
				float expected =1811;
				float experimental = emp.CalculateYearBonus();

				assertEquals(expected,experimental,0.1);


			}
}
