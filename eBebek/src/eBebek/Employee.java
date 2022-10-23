package eBebek;

public class Employee {

	static String name;
	static double salary;
	static int workHours;
	static int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		Employee.name = name;
		Employee.salary = salary;
		Employee.workHours = workHours;
		Employee.hireYear = hireYear;

	}
	
	public static void main(String[] args) {
		Employee calisan = new Employee("Alper", 2000, 45, 1985);
		System.out.println(calisan);
		}

	public static double tax(double salary) {
		double vergi = 0;
		if (salary > 1000) {
			vergi = salary * 0.03;
		}
		return vergi;
	}

	public static double bonus(int workHours) {
		double bonus = 0;
		if (workHours > 30) {
			bonus = (workHours - 40) * 30;
		}
		return bonus;
	}

	public static double raiseSalary(double salary, double hireYear) {
		double raiseSalary = 0;
		if ((2021 - hireYear) < 10) {
			raiseSalary = (salary * 0.05);
		} else if ((2021 - hireYear) > 10 && (2021 - hireYear) < 20) {
			raiseSalary = (salary * 0.10);
		} else
			raiseSalary = (salary * 0.15);
		return raiseSalary;
	}

	public String toString() {
		return "Adı : " + name + "\n" + "Maaşı : " + salary + "\n" + "Çalışma Saati : " + workHours + "\n"
				+ "Başlangıç yılı : " + hireYear + "\n" + "Vergi : " + tax(salary) + "\n" + "Bonus : "
				+ bonus(workHours) + "\n" + "Maaş Artışı : " + raiseSalary(salary, hireYear) + "\n"
				+ "Vergi ve Bonuslar ile birlikte maaş : " + (salary - tax(salary) + bonus(workHours)) + "\n"
				+ "Toplam Maaş :" + (salary - tax(salary) + bonus(workHours) + raiseSalary(salary, hireYear));

	}
}
